package com.api.base;

import io.restassured.response.Response;

public class StoreService extends BaseService {

	private static final String ORDER_ENDPOINT = "/store/";

	public Response placeOrder(Object payLoad) {
		return postRequest(payLoad, ORDER_ENDPOINT + "order");
	}

	public Response getOrderById() {
		return getRequest(ORDER_ENDPOINT + "inventory");
	}

}
