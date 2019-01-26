package com.sujanth.logindemo1.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujanth.logindemo1.DAO.UserDAO;
import com.sujanth.logindemo1.model.User;
//import com.sujanth.logindemo.model.User;
 
@Service
public class UserService {
 
    @Autowired
    private UserDAO userDAO;
 
    public String loadUserByUsername(String userEmail,String password){
        String userInfo = this.userDAO.findUserAccount(userEmail,password);
 
        if (userInfo == null) {
            System.out.println("User not found! " + userEmail);
        }
 
        System.out.println("Found User: " + userInfo);
  
        return userInfo;
    }
    
    public List<User> getUserRecords() {
		return this.userDAO.getUserRecords();
	}
 
}
