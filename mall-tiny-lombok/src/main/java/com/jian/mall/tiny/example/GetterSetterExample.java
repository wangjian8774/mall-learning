package com.jian.mall.tiny.example;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @description @Getter @Setter注解使用示例
 */
public class GetterSetterExample {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private Integer age;

    public static void main(String[] args) {
        GetterSetterExample example = new GetterSetterExample();
        example.setName("test");
        example.setAge(20);
        System.out.printf("name:%s age:%d",example.getName(),example.getAge());
    }
}
