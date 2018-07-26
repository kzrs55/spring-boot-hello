package com.kfit.kzrs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zjutK on 2018/7/15.
 */
@Controller
@RequestMapping("/user")
public class indexController {
    private final static Logger logger = LoggerFactory.getLogger(indexController.class);
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        logger.debug("记录debug日志");
        logger.error("记录error日志");
        logger.info("访问了index方法");
        return "index";
    }

    @RequestMapping(value = "/login_view",method = RequestMethod.GET)
    public String login_view(){
        return "login";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String upload(){
        return "upload";
    }

}
