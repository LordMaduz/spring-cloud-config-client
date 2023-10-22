package com.example.demo.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("notification")
@Data
@RefreshScope
public class NotificationConfig {

    private String profile;
    private String type;
    private Integer port;
    private String userName;
}
