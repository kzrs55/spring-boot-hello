package com.kfit.kzrs.controller;

import com.kfit.kzrs.entity.UserEntity;
import com.kfit.kzrs.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zjutK on 2018/7/15.
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userJPA.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity userEntity){
        return userJPA.save(userEntity);
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id){
        userJPA.delete(id);
        return userJPA.findAll();
    }
}
