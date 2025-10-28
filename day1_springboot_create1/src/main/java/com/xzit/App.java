package com.xzit;
//服务器
//内嵌了容器：Tomcat
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
