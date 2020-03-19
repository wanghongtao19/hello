package com.springboot.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghongtao on 2019-02-19.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/h")
    private String index()
    {
        return "Hello World!";
    }
    @RequestMapping("/")
    public  String index1(){
        return "Greetings from Spring Boot!";
    }

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;
    @RequestMapping(value = "/miya")
    public String miya(){
        System.out.println("hello");

        return name+":"+age;
    }



}
