package com.allen.controller;

import com.allen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Allen on 2016/6/15.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("login")
    public String login(WebRequest request) {
        String name, password;
        name = request.getParameter("UserName");
        password = request.getParameter("Password");
        if (userService.hasMatchCount(name, password) > 0) {
            return "success";
        } else {
            return "fail";
        }
    }
}
