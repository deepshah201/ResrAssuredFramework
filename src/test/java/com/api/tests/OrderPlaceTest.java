package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.StoreService;
import com.api.models.request.StoreRequest;
import com.api.models.response.StoreResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class OrderPlaceTest {

	@Test(priority = 1)
	public void orderTest() {
		StoreRequest storeRequest = new StoreRequest("0", "0", 2, "2025-09-13T10:36:54.365Z", "placed", true);
		StoreService storeService = new StoreService();
		Response response = storeService.placeOrder(storeRequest);
		StoreResponse storeResponse = response.as(StoreResponse.class);
		System.out.println(response.asPrettyString());
		Assert.assertTrue(storeResponse.getId() != null);
		Assert.assertEquals(storeResponse.getPetId(), storeRequest.getPetId());
	}

	@Test(priority = 2)
	public void getOrderByIdTest() {
		StoreService storeService = new StoreService();
		Response response = storeService.getOrderById();
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
