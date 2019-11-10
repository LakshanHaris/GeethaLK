package com.jcode.geetha.util;

import com.jcode.geetha.enums.SessionTypeEnum;

import javax.servlet.http.HttpSession;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 17:04
 * Project: geetha.
 */
public class SessionUtil {

    /*
    Session attributes declare here
    */
    public static final String USER_DATA="userData";

    public static void setAttributesToSession(HttpSession session, String attributeName, Object data, String sessionType) {
        SessionTypeEnum sessionTypeEnum = SessionTypeEnum.valueOf(sessionType);
        switch (sessionTypeEnum) {
            case USER_DETAILS:
                session.setAttribute(attributeName, data);
                session.setMaxInactiveInterval(900);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sessionType);
        }
    }

}
