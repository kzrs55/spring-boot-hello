package com.kfit.dao;

import com.kfit.test.bean.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zjutK on 2018/7/8.
 */
public interface DemoRepository extends CrudRepository<Demo,Long> {
}
