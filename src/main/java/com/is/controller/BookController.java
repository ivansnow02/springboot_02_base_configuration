package com.is.controller;

import com.is.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${country}")
    private String country1;
    @Value("${users.name}")
    private String name1;
    @Value("${likes[1]}")
    private String likes1;
    @Value("${tempDir}")
    private String tempDir1;
    //使用自动装配将所有的数据封装到一个对象中
    @Autowired
    private Environment environment;
    @Autowired
    private MyDataSource myDataSource;
    @GetMapping
    public String getById() {
        System.out.println("springboot is running");
        System.out.println(country1);
        System.out.println(name1);
        System.out.println(likes1);
        System.out.println(tempDir1);
        System.out.println("----------------------------");
        System.out.println(environment.getProperty("country"));
        System.out.println("----------------------------");
        System.out.println(myDataSource);
        return "springboot is running";
    }
}
