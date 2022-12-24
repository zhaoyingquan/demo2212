package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestDao testDao;
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public int test(){
        try {
            return testDao.count();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
