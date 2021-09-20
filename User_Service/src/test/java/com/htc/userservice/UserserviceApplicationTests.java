package com.htc.userservice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.htc.userservice.entity.UserService;
import com.htc.userservice.service.UserServiceInterface;

@SpringBootTest
class UserserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private UserServiceInterface userServiceInterface; 

	@BeforeEach
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void user_Insertion_Test() {
		UserService userService=new UserService("name1",1222311,"name@example.com",43,"Male");
		assertEquals(userServiceInterface.save(userService),userServiceInterface.findById(1222311L).get());
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("After Test");
	}
}
