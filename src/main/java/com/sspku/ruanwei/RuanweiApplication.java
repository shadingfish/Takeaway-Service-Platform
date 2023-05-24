package com.sspku.ruanwei;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RuanweiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuanweiApplication.class, args);
        log.info("项目成功启动...");
    }

}
