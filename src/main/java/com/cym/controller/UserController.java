package com.cym.controller;

import com.cym.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/hello")
    public Object sayHello() {
        return "Hello World727!";
    }

    @RequestMapping("/login")
    public String login(String userName,String password){
        boolean login = iUserService.login(userName,password);
        if(login){
            return "登录成功！";
        }else{
            return "登录失败！";
        }
    }

    @ApiOperation(value="注册用户", notes="根据userName和password来获取用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userName", value="用户名称", required=true, dataType="String"),
            @ApiImplicitParam(name="password", value="用户密码", required=true, dataType="String")
    })
    @RequestMapping("/register")
    public String register(String userName,String password){
        boolean rt =  iUserService.register(userName,password);
        if(rt){
            return "注册成功！";
        }else{
            return "注册失败！";
        }
    }







}
