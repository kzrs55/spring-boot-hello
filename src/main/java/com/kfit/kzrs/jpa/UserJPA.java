package com.kfit.kzrs.jpa;

import com.kfit.kzrs.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by zjutK on 2018/7/15.
 */
public interface UserJPA extends
        JpaRepository<UserJPA, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable {
}
