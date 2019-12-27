package com.jcode.geetha.config;

import com.jcode.geetha.model.User;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 12/27/2019
 * Time: 8:32 PM
 * Project: geetha.
 */
@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private AuthorizationService authorizationService;

    @Autowired
    private JwtUtilService jwtUtilService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        final String authorizationHeader = httpServletRequest.getHeader(SecurityUtil.AUTHORIZATION_HEADER);
        String userName = null;
        String jwtToken = null;
        if (Objects.nonNull(authorizationHeader) && authorizationHeader.startsWith(SecurityUtil.AUTHORIZATION_HEADER_STARTS_WITH)) {
            jwtToken = authorizationHeader.substring(SecurityUtil.AUTHORIZATION_HEADER_STARTS_WITH_SUBSTR_VALUE);
            userName = jwtUtilService.extractUserName(jwtToken);
            logger.info("Authorization header fetched and user name granted from jwt token ...");
        }
        if (Objects.nonNull(userName) && SecurityContextHolder.getContext().getAuthentication() == null) {
            User userData = authorizationService.findUserByUserName(userName);
            if (jwtUtilService.validateToken(jwtToken, userData)) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userData.getUserName(), userData.getPassword(), new ArrayList<>());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                logger.info("Token validated and user data authenticated ...");
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

}
