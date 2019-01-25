package com.sujanth.logindemo1.model;

public class User {
	
	private String userId;
    private String email;
    private String password;
    private String userName;
    
    public User() {
    	
    }

	public User(String userId, String email, String password, String userName) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", userName=" + userName
				+ "]";
	}
    
	
}
