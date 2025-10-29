package com.xzit;

import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@OpenAPI30
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
