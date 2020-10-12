package com.acmday.log.server;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Test
    void log() {
        logger.info("act=log msg=one!");
    }
}
