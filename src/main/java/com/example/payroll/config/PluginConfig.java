package com.example.payroll.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PluginConfig implements WebMvcConfigurer {
    public static final String PREFIX = "/api";

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix(PREFIX, c -> c.isAnnotationPresent(RestController.class));
    }
}
