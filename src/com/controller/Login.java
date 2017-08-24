package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("test login!");
		return "test";
	}
	
    @RequestMapping("login.do")
    public String login(String username,String password){
        if ("1434579002".equals(username)) {
            System.out.println(username +" 登录成功");
            return "loginSuccess";//逻辑视图名       跳转页面默认为转发
        }
        return "loginError";
    }
}
