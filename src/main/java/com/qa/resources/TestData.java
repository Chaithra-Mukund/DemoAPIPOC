package com.qa.resources;

import java.util.ArrayList;
import java.util.List;

import com.qa.data.PostData;
import com.qa.data.SensorDataObj;

public class TestData {

	public PostData CreateUserPayload() {

		//Create the users with the POJO class
		
		PostData p = new PostData();
		p.setUserId("2301TestRoche1");
		p.setFirstName("John");
		p.setLastName("Doe");
		p.setGender("M");
		p.setDob("1995-11-06");
		p.setEmail("john@gmail.com");
		p.setCellNumber("1234567890");
		p.setAddress("23B Golf Court Apex, NC 27502");
		p.setUserRole("Patient");
		p.setHospitalId("Max");
		p.setDeviceId("#1211");
		p.setDoctorId("doc1");

		SensorDataObj s = new SensorDataObj();
		s.setBloodOxygenation(12);
		s.setSkinTemp(12.20);
		s.setSkinBloodPerfusion(12);
		s.setRespirationRate(20);
		s.setHrv(1);
		s.setIbi(1);
		s.setSteps(1);
		s.setStress(1);
		s.setSleep(1);
		s.setBpw(1);
		s.setEnergyExpenditure(1);
		s.setSweat(1);
		s.setHealthscores(1);

		List<SensorDataObj> sd = new ArrayList<SensorDataObj>();
		sd.add(s);
		p.setSensorData(sd);
		return p;

	}

	public static String Payload() {

		// The request Payload for creating the users

		return "{\r\n" + "	\"userId\": \"1506TestRoche\",\r\n" + "	\"firstName\": \"John\",\r\n"
				+ "	\"lastName\": \"Doe\",\r\n" + "	\"gender\": \"M\",\r\n" + "	\"dob\": \"1995-11-06\",\r\n"
				+ "	\"email\": \"john@gmail.com\",\r\n" + "	\"cellNumber\": \"1234567890\",\r\n"
				+ "	\"address\": \"23B Golf Court Apex, NC 27502\",\r\n" + "	\"userRole\": \"Patient\",\r\n"
				+ "	\"hospitalId\": \"Max\",\r\n" + "	\"deviceId\": \"#1211\",\r\n" + "	\"doctorId\":\"doc1\",\r\n"
				+ "	\"sensorData\":[\r\n" + "	{\r\n" + "		\"bloodOxygenation\":12,\r\n"
				+ "		\"skinTemp\":12.20,\r\n" + "		\"skinBloodPerfusion\":\"12\",\r\n"
				+ "		\"respirationRate\":20,\r\n" + "		\"hrv\":1,\r\n" + "		\"ibi\":1,\r\n"
				+ "		\"steps\":1,\r\n" + "		\"stress\":1,\r\n" + "		\"sleep\":1,\r\n"
				+ "		\"bpw\":1,\r\n" + "		\"energyExpenditure\":1,\r\n" + "		\"sweat\":1,\r\n"
				+ "		\"healthscores\":1\r\n" + "	}]\r\n" + "}\r\n" + "\r\n" + "";
	}

}
