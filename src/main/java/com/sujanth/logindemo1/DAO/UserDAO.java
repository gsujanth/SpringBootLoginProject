package com.sujanth.logindemo1.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujanth.logindemo1.model.User;

//import com.sujanth.logindemo.model.User;

@Repository
@Transactional
public class UserDAO extends JdbcDaoSupport {
	
	@Autowired
    public UserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    public String findUserAccount(String userEmail,String password) {
        
        String sql = "Select u.user_name from users u where u.user_email = ? && u.password=?";
 
        Object[] params = new Object[] { userEmail,password };
        
        try {
            String userInfo = this.getJdbcTemplate().queryForObject(sql, params,String.class);
            return userInfo;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    
    public List<User> getUserRecords() {
    	String sql = "Select * from users u";
    	 
        try {
            List usersInfo = this.getJdbcTemplate().queryForList(sql);
            System.out.println(usersInfo.size());
            return usersInfo; 
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}
 
}
