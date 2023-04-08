package com.yangzhuo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yangzhuo")
@PropertySource("jdbc.properties")//不支持通配符
public class SpringConfig {
}
