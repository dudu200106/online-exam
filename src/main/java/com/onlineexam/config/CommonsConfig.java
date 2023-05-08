package com.onlineexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 当前类是配置Spring扫描环境的配置类,必须添加配置注解@Configuration才能生效
@Configuration
// 组件扫描, 统一异常处理类生效
@ComponentScan("com.onlineexam.exception")
public class CommonsConfig {
}
