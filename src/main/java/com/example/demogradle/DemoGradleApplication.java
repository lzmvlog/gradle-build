package com.example.demogradle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demogradle.dao")
public class DemoGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class, args);
    }

}
