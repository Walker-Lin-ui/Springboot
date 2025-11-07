package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzit.mapper")
public class Day9RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day9RedisApplication.class, args);
    }

}
