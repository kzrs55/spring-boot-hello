package com.kfit.kzrs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjutK on 2018/7/26.
 */

@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping(value = "/test")
    public String index(){
        logger.debug("Test -> 记录debug日志");
        logger.error("Test -> 记录error日志");
        logger.info("Test -> 访问了index方法");
        return "index";
    }

}
