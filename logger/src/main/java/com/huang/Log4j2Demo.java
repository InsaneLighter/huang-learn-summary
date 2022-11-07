package com.huang;

//log-api
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @Time 2022-10-31 16:59
 * Created by Huang
 * className: Log4j2Demo
 * Description:
 */
public class Log4j2Demo {
    private static Logger logger= LogManager.getLogger(Log4j2Demo.class);

    @Test
    public void log(){
        logger.trace("trace level log");
        logger.debug("debug level log");
        logger.info("info level log");
        logger.error("error level log");
        logger.fatal("fatal level log");
    }
}
