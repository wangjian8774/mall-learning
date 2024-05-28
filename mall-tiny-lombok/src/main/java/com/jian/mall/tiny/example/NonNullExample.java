package com.jian.mall.tiny.example;

import lombok.NonNull;

/**
 * @description @NonNull注解使用示例
 */
public class NonNullExample {
    private String name;
    public  NonNullExample(@NonNull String name){
        this.name = name;
    }

    public static void main(String[] args) {
        new NonNullExample("test");
        //会抛出NullPointerException
        new NonNullExample(null);
    }
}
