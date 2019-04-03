package com.cym.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public Object errorPage(){
        return "页面没有找到了！";
    }
}
