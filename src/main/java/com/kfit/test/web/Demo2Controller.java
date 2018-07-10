package com.kfit.test.web;

import com.kfit.test.bean.Demo;
import com.kfit.test.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zjutK on 2018/7/8.
 */

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
    @Resource
    private DemoService demoService;

    @RequestMapping("save")
    public String save(){
        Demo d = new Demo();
        d.setName("Angel");
        demoService.save(d);
        return "ok.demo2controller.save";
    }

    @RequestMapping("/getById")
    public Demo getById(long id){
        return demoService.getById(id);
    }
}
