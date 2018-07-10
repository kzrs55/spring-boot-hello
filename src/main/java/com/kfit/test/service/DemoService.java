package com.kfit.test.service;


import com.kfit.dao.DemoRepository;
import com.kfit.test.Dao.DemoDao;
import com.kfit.test.bean.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by zjutK on 2018/7/8.
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }

    public Demo getById(long id){
        return demoDao.getById(id);

    }

}
