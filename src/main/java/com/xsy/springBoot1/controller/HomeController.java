package com.xsy.springBoot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/6/16.
 */
@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "你好";
    }
}
