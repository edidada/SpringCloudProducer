package com.neo.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-curd-withzipkinandadmin")
public interface UserDao {
    @RequestMapping(value = "/test/user/testfeign")
    public String getInfo(@RequestParam(value = "id") int id);
}
