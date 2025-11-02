package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper
@MapperScan(basePackages = {"com.xzit.mapper"})
public class Day4SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day4SpringbootMybatisApplication.class, args);
    }

}
