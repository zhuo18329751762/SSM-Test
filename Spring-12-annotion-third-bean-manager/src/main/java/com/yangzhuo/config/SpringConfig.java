package com.yangzhuo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@Import({JdbcConfig.class})
public class SpringConfig {
    // 1 定义一个方法获得要管理的对象
    // 2 添加@Bean,表示当前方法的返回值是一个bean

}
