package com.kfit.test.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zjutK on 2018/7/7.
 */

public class Demo {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
