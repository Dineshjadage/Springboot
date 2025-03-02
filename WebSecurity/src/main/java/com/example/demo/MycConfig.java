package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MycConfig implements WebMvcConfigurer {  // Fixed class name and interface implementation

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {  // Added @Override annotation and fixed syntax
        registry.addViewController("/Home").setViewName("Home");  // Corrected punctuation
        registry.addViewController("/").setViewName("Home");
        registry.addViewController("/Hello").setViewName("Hello");
        registry.addViewController("/login").setViewName("login");
    }
}
