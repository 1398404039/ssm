package com.lwz.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lwz.ssm.pojo.User;
import com.lwz.ssm.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userSvc;
	
	@RequestMapping("/showUser")
	public String getUser(Model model){
		List<User> list=new ArrayList<User>();
		list=userSvc.getAllUsers();
		
		User user=list.size()>0?list.get(0):new User();
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("/getUser")
	public String showUser(Model model){
		return "showUser";
	}
}
