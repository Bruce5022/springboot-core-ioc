package com.sky.ioc.property;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;


public class People {

    @Value("shizhanwei")
    private String name;
    @Value("#{29-10}")
    private Integer age;

    @Value("${nick-name}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
