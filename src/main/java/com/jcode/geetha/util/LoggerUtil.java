package com.jcode.geetha.util;

import java.time.LocalDateTime;

/**
 * Created by Lakshan harischandra
 * Date: 10/11/2019
 * Time: 10:30
 * Project: geetha.
 */
public class LoggerUtil {

    public static String setLoggerInfoWithoutUser(String... loggerInfo) {
        return "Accessed " + loggerInfo[0] + " at " + LocalDateTime.now() + " info : " + loggerInfo[1];
    }

    public static String setLoggerInfo(String... loggerInfo) {
        return "System user - " + loggerInfo[0] + " accessed " + loggerInfo[1] + " at " + LocalDateTime.now() + " info : " + loggerInfo[2];
    }

}
