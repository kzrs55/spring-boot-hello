package com.kfit.base.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zjutK on 2018/7/7.
 */

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req,Exception e){
        e.printStackTrace();
        System.out.println("Global Default Exception Handler default Error Handler");
    }
}
