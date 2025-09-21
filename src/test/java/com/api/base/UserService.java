package com.api.base;

import io.restassured.response.Response;

public class UserService extends BaseService {

	private static final String USER_ENDPOINT = "/user/";

	public Response createusers(Object payLoad) {
		return postRequest(payLoad, USER_ENDPOINT + "createWithList");
	}

}
