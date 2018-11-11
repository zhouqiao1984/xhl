package com.xhl.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**  读取配置文件  */
@RestController
@Component
@RequestMapping(value="/test01")
public class SprTest01 {

    @Value("${xhl.name}")
    private String name;

    @Value("${xhl.age}")
    private Integer age;

    @RequestMapping(value="/xhl",method = RequestMethod.GET)
    public String getInfo(){

        return "xhl.name= "+name+"  xhl.age= "+age;

    }


}
