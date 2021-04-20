package com.royce.servicecommon.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerUtil {


    public static void info(String msg) {
        log.info(msg);
    }

    public static void info(String msg, Object... obj) {
        log.info(msg, obj);
    }
}
