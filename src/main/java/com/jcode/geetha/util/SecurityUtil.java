package com.jcode.geetha.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

/*
Created by Lakshan on 2019.10.11
For Geetha.lk
*/
public class SecurityUtil {

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String AUTHORIZATION_HEADER_STARTS_WITH = "geethalk";
    public static final int AUTHORIZATION_HEADER_STARTS_WITH_SUBSTR_VALUE = 8;
    public static final String SECRET_KEY="geetha";

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean matchHashedPassword(String password_user, String password_db) {
        return BCrypt.checkpw(password_user, password_db);
    }

}
