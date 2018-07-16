package com.kfit.kzrs.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zjutK on 2018/7/15.
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    public UserEntity() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
