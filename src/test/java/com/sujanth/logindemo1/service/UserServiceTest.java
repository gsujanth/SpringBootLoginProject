package com.sujanth.logindemo1.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void loadUserByUsernameTest() {
		String userEmail="gs@gmail.com";
		String password="12345";
		String userInfo = userService.loadUserByUsername(userEmail, password);
		System.out.println(userInfo);
		assertEquals("Sujanth Babu", userService.loadUserByUsername(userEmail, password));
	}

}
