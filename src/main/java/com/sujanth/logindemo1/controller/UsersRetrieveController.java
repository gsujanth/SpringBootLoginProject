package com.sujanth.logindemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sujanth.logindemo1.model.User;
//import com.sujanth.bootrestws.beans.StudentRegistration;
import com.sujanth.logindemo1.service.UserService;

@Controller
public class UsersRetrieveController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/allUsers")
	@ResponseBody
	public List<User> getUsers() {
		return userService.getUserRecords();
	}

}
