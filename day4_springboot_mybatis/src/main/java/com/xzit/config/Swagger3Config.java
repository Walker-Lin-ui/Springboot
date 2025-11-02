package com.xzit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Walker
 * @date 2025/10/29
 * @project springboot_xzit
 */
@Configuration
public class Swagger3Config {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("xx项目")
                .description("项目描述")
                .version("1.0")
                .contact(new Contact()
                        .name("Walker")
                        .url("https://www.walker.com")
                        .email("115@qq.com"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0.html"));
    }
}