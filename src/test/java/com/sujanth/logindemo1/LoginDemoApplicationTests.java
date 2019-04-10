package com.sujanth.logindemo1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sujanth.logindemo1.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginDemoApplicationTests {
	
	@Autowired
    private UserController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

