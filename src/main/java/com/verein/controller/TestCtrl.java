package com.verein.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LinYaoyao on 16/12/2.
 */
@RestController
public class TestCtrl {

    @RequestMapping(value="/set",method= RequestMethod.GET)
    public String login(HttpServletRequest request){
        request.getSession().setAttribute("sessionId", "1dfdfsfa");
        return"Hello";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("sessionId");
    }
}
