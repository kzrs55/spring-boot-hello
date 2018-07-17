package com.kfit.kzrs.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.List;

/**
 * Created by zjutK on 2018/7/17.
 */
@Configuration
public class FastJsonConfiguration extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        调用父类配置
        super.configureMessageConverters(converters);
//        创建Fastjson消息转换器
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        创建配置器
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        修改配置返回内容的过滤
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty
        );
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastJsonHttpMessageConverter
        );
    }

}
