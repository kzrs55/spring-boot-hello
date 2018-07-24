package com.kfit.kzrs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zjutK on 2018/7/24.
 */

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/kzrs55/resource/**").addResourceLocations("classpath:/static/");
    }
}
