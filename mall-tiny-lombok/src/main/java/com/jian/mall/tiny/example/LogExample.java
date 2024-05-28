package com.jian.mall.tiny.example;

import lombok.extern.java.Log;

/**
 * @description @Log注解使用示例
 */
@Log
public class LogExample {
    public static void main(String[] args) {
        log.info("level info");
        log.warning("level warning");
        log.severe("level severe");
    }
}
