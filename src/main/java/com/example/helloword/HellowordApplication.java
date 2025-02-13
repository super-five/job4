package com.example.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HellowordApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HellowordApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        //Application为spring boot项目本身的启动类
        return builder.sources(HellowordApplication.class);
    }

}
