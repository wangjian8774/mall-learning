package com.jian.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@MapperScan("com.jian.mall.tiny.mbg.mapper")
@Lazy
public class MyBatisConfig {
}
