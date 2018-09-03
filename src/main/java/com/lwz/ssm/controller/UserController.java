package com.lwz.ssm.controller;

import com.lwz.ssm.entity.UserEntity;
import com.lwz.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String toIndex(Model model) {
        UserEntity userEntity = userService.getUser();
        model.addAttribute("user", userEntity);
        return "index";
    }
}
