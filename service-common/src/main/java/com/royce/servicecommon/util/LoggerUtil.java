package com.royce.servicecommon.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    Logger logger = LoggerFactory.getLogger(getClass());

    public void info(String msg) {
        logger.info(msg);
    }
}
