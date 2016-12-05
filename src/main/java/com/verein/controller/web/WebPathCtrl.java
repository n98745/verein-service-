package com.verein.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LinYaoyao on 16/12/2.
 * 页面 路径定义
 */
@Controller
public class WebPathCtrl {

    @RequestMapping(value="/index")
    public String index(){
        return "web/index.html";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "web/login.html";
    }

}
