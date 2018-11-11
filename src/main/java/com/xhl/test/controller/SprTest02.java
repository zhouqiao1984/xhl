package com.xhl.test.controller;


import com.xhl.test.pojo.ConfigObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**  批量读取配置文件  */
@RestController
@Component
@RequestMapping(value="/test02")
public class SprTest02 {

    @Autowired
    private ConfigObj configObj;

    @RequestMapping(value="/xhl",method = RequestMethod.GET)
    public ConfigObj getInfo(){

        return configObj;

    }


}
