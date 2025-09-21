package com.api.tests;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.UserService;
import com.api.models.request.UserCreationRequest;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class UserCreationTest {

	@Test
	public void orderTest() {
		UserCreationRequest user1 = new UserCreationRequest.Builder().ID(11).Username("testuser1").FirstName("Test1")
				.LastName("User1").Email("test1@gmail.com").Password("test@123").Phone("1234567890").UserStatus(1)
				.build();
		UserCreationRequest user2 = new UserCreationRequest.Builder().ID(12).Username("testuser2").FirstName("Test2")
				.LastName("User2").Email("test2@gmail.com").Password("test@456").Phone("0987654321").UserStatus(2)
				.build();
		List<UserCreationRequest> userList = new LinkedList<UserCreationRequest>();
		userList.add(user1);
		userList.add(user2);
		UserService userService = new UserService();
		Response response = userService.createusers(userList);
		System.out.println(response.asPrettyString());
	}
}
