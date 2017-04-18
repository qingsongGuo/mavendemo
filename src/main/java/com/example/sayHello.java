package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hello_guo on 2017/4/11.
 */
@RestController
public class sayHello {
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
    @Autowired
    private GirlProperties girl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return girl.getCupSize();
    }
}
