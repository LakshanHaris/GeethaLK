package com.jcode.geetha.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

/*
Created by Lakshan on 2019.10.11
For Geetha.lk
*/
public class SecurityUtil {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
