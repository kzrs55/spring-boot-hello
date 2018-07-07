package com.kfit.test.web;


import com.alibaba.fastjson.JSONPObject;
import com.kfit.test.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjutK on 2018/7/7.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }
//    @RequestMapping("/getFastjson")
//    public String getFastjaon(){
//        Demo demo =new Demo();
//        demo.setId(2);
//        demo.setName("Angel2");
//        return JSONPObject.toJSONString(demo);
//    }
    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
