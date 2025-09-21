package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Pratice2 {

	@Test
	public void testPost() {
		Response response = given().baseUri("https://petstore.swagger.io/v2").header("Content-Type", "application/json")
				.body("{\r\n" + "  \"id\": 0,\r\n" + "  \"petId\": 0,\r\n" + "  \"quantity\": 2,\r\n"
						+ "  \"shipDate\": \"2025-09-13T10:36:54.365Z\",\r\n" + "  \"status\": \"placed\",\r\n"
						+ "  \"complete\": true\r\n" + "}")
				.post("/store/order");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
