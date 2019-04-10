package com.sujanth.logindemo1;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sujanth.logindemo1.controller.UserController;
import com.sujanth.logindemo1.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerWebMvcTest {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
    private UserService service;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
    	//when(service.greet()).thenReturn("Hello Mock");
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Welcome")));
    }
}
