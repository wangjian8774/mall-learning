package com.jian.mall.tiny.example;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * @description @SneakyThrows注解使用示例
 */
public class SneakyThrowsExample {

    //自动抛出异常，无需处理
    @SneakyThrows(UnsupportedEncodingException.class)
    public static byte[] str2byte(String str){
        return str.getBytes("UTF-8");
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str2byte(str).length);
    }
}
