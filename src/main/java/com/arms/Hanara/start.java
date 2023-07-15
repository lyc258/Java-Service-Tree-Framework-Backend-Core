package com.arms.Hanara;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class start {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public start() {
        logger.info("--------------------------------------------- 한나라");
    }
}
