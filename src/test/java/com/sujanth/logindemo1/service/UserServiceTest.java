package com.sujanth.logindemo1.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
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
		String userInfo1="Sujanth Babu";
		System.out.println("user service: "+userService.loadUserByUsername(userEmail, password));
		assertEquals(userInfo1, userService.loadUserByUsername(userEmail, password));
	}

}
