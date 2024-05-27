package com.jian.mall.tiny.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */

@Configuration
@MapperScan({"com.jian.mall.tiny.mbg.mapper","com.jian.mall.tiny.dao"})
public class MyBatisConfig {
}
