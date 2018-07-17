package com.kfit.base.servlet;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zjutK on 2018/7/17.
 */

@Configuration
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        servletRegistrationBean.addInitParameter("deny","192.168.0.19");
        servletRegistrationBean.addInitParameter("loginUsername","druid");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter(){
//        创建过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//        设置过滤器过滤路径
        filterRegistrationBean.addUrlPatterns("/");
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.css,*.ico");
        return filterRegistrationBean;
    }
}
