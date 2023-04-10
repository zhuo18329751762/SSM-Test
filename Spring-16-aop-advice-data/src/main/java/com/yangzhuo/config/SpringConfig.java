package com.yangzhuo.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.yangzhuo")
//aop必写注释
@EnableAspectJAutoProxy
public class SpringConfig {
}

