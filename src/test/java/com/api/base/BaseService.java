package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASEURI = "https://petstore.swagger.io/v2";

	protected RequestSpecification requestSpec = given().baseUri(BASEURI);

	static {
		RestAssured.filters(new LoggingFilter());
	}

	/*
	 * public BaseService() { this.requestSpec = given().baseUri(BASEURI); }
	 */

	protected Response postRequest(Object payLoad, String endpoint) {
		return requestSpec.contentType(ContentType.JSON).body(payLoad).post(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestSpec.get(endpoint);
	}

}
