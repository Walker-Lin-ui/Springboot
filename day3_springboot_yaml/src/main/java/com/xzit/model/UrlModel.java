package com.xzit.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@Component
@Data
@ConfigurationProperties(prefix = "users.customer")
public class UrlModel {
    private String url;
}
