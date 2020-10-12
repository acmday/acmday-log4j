package com.acmday.log.server.component;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@Order(1)
public class ArgComponent implements CommandLineRunner {

    //private static Logger log = LoggerFactory.getLogger(ArgComponent.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("=====应用已经成功启动====={}", Arrays.asList(args));
    }
}
