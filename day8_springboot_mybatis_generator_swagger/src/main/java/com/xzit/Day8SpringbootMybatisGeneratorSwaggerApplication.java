package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzit.gene.mapper")
public class Day8SpringbootMybatisGeneratorSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day8SpringbootMybatisGeneratorSwaggerApplication.class, args);
    }

}
