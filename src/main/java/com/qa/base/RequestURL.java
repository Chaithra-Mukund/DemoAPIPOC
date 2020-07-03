package com.qa.base;

import io.restassured.RestAssured;

public class RequestURL {

	// the Base URL
	public static void FredHutchURL() {

		RestAssured.baseURI = "http://ec2-54-149-171-123.us-west-2.compute.amazonaws.com:8080";
		

	}

	// The Service URL
	public static String FredHutchServiceURL() {

		String serviceURL = "/api/v1/user-management/users/";
		return serviceURL;

	}

	public static void BaseURL() {

		RestAssured.baseURI = "https://reqres.in/";
		

	}

	
	public static String ServiceURL() {

		String serviceURL = "api/users";
		return serviceURL;

	}
	
	
	public static String GetUsersServiceURL() {

		String getUsersServiceURL = "api/unknown";
		return getUsersServiceURL;

	}
	
	
}
