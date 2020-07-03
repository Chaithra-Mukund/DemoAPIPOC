package com.qa.resources;

import io.restassured.RestAssured;

public class Utils {
	
	    // the Base URL
		public static void FredHutchURL() {

			RestAssured.baseURI = "http://ec2-54-149-171-123.us-west-2.compute.amazonaws.com:8080";

		}

		// The Service URL
		public static String ServiceURL() {

			String serviceURL = "/api/v1/user-management/users/";
			return serviceURL;

		}

	


}
