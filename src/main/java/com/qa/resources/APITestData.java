package com.qa.resources;

import com.qa.data.APIRes;

public class APITestData {

	public APIRes CreatePayload() {
		APIRes a = new APIRes();
		a.setName("Chaithra");
		a.setJob("Tester");
		return a;
	}
	
	public static String Payload() {

		// The request Payload for creating the users

		return "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
	}

}
