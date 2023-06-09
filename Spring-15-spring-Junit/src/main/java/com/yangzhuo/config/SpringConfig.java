package com.yangzhuo.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.yangzhuo")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
//aop必写注释
@EnableAspectJAutoProxy
public class SpringConfig {
}
