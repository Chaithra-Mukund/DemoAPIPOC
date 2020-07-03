package com.fh.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.RequestURL;

import io.restassured.response.Response;

public class GetUser {

	Response getListRes;

	@BeforeMethod
	public void setUp() {

		RequestURL.BaseURL();

	}

	@Test
	public void getUser() {

		// Ability to view selected user profile with the GET method
		getListRes = given().when().get(RequestURL.ServiceURL() + "2").then().assertThat().statusCode(200).extract()
				.response();

		String UserResBody = getListRes.asString();

		System.out.println("The response body for searched user");
		System.out.println(UserResBody);
		System.out.println("--------------------------------");

	}

}
