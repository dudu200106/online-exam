package com.onlineexam.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 组件扫描, Mybatis框架要求扫描指定包,包中mapper接口会生成实现类
@MapperScan("com.onlineexam.mapper")
public class MybatisConfig {
}
