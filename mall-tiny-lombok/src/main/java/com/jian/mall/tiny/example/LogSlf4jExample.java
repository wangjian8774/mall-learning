package com.jian.mall.tiny.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @description @Slf4j注解使用示例
 */
@Slf4j
public class LogSlf4jExample {
    public static void main(String[] args) {
        log.info("level:{}","info");
        log.warn("level:{}","warn");
        log.error("level:{}", "error");
    }
}
