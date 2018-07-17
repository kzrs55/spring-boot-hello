package com.kfit.kzrs.controller;

import com.kfit.kzrs.entity.UserEntity;
import com.kfit.kzrs.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zjutK on 2018/7/17.
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController {
    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/login")
    public String login(final UserEntity user, HttpServletRequest httpServletRequest){
        String result = "登录成功";
        boolean flag = true;
        UserEntity userEntity = userJPA.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"),user.getName()));
                return null;
            }
        });
        if(userEntity == null){
            flag = false;
            result = "用户名不存在,登录失败";
        }
        else if(!userEntity.getPassword().equals(user.getPassword())){
            flag = false;
            result = "用户名密码不相符,登录失败";
        }
        if(flag){
            httpServletRequest.getSession().setAttribute("_session_user",userEntity);
        }
        return result;
    }
}
