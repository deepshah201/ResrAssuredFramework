package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class Pratice {

	@Test
	public void testPost() {
		RestAssured.baseURI = "https://petstore.swagger.io";
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");
		RequestSpecification z = y.body("{\r\n" + "  \"id\": 0,\r\n" + "  \"petId\": 0,\r\n" + "  \"quantity\": 2,\r\n"
				+ "  \"shipDate\": \"2025-09-13T10:36:54.365Z\",\r\n" + "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n" + "}");
		Response response = z.post("/v2/store/order");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
