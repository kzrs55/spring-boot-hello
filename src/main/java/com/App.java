package com;

import com.kfit.base.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by zjutK on 2018/7/6.
 */
//@RestController
@SpringBootApplication
@ServletComponentScan
@Import(value={SpringUtil.class})
public class App {
//    @RequestMapping("/")
//    public String hello() {
//        return "Hello World";
//    }
    @Bean
    public SpringUtil springUtil2(){
        return new SpringUtil();
    }
    /**
     *
     参数里VM参数设置为：
     -javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
