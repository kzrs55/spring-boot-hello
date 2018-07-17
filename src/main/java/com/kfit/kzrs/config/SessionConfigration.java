package com.kfit.kzrs.config;

import com.kfit.kzrs.Interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zjutK on 2018/7/17.
 */
@Configuration
public class SessionConfigration extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}
