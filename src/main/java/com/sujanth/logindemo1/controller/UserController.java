package com.sujanth.logindemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sujanth.logindemo1.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
 
        return "loginPage";
    }
	
	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logOutPage";
    }
	
	@RequestMapping(value = "/loginValidate", method = RequestMethod.POST)
    public String loginValidate(@RequestParam(value="useremail") String userEmail, @RequestParam(value="password") String password,Model model) {
 
		//String userEmail="gs@gmail.com";
		//String password="12345"; 
        
        String userInfo= userService.loadUserByUsername(userEmail, password);
        model.addAttribute("userInfo", userInfo);
 
        return "userInfoPage";
    }
	
}