package com.neo.controller;

import com.neo.interfaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {

        EurekaInstanceConfigBean eurekaInstanceConfigBean;
        return "hello "+name+"，this is first messge";
    }

    @RequestMapping("/test/user/{id}")
    public String getBlogInfo(@PathVariable("id") int id){
        return userDao.getInfo(id);
    }

}