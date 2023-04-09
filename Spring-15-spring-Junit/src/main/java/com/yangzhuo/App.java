package com.yangzhuo;

import com.yangzhuo.config.SpringConfig;
import com.yangzhuo.domain.User;
import com.yangzhuo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        User user = userService.findById(2);
        System.out.println(user);
    }
}
