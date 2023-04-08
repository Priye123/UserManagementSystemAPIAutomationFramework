package testcases;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import pojoclasses.UserPOJO;
import utilityclasses.MapUtils;
import utilityclasses.RESTUtils;

public class TestCases {

	@Test
	public void getUsers() {
		String url = "http://localhost:3000/users";
		RESTUtils restUtils = new RESTUtils();
		Response response = restUtils.get(url);
		System.out.println("-------------------come from testcase class-------------------");
		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void getUserswithSingleQueryParams() {
		String url = "http://localhost:3000/users";
		String key = "id";
		int value = 2;

		RESTUtils restUtils = new RESTUtils();
		Response response = restUtils.getWithQueryParams(url, key, value);

		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void getUserswithMultipleQueryParams() {
		String url = "http://localhost:3000/users";

		RESTUtils restUtils = new RESTUtils();

		Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("name", "Gagan");

		Response response = restUtils.getWithMultipleQueryParams(url, map);

		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void addUser() {
		String url = "http://localhost:3000/users";

		RESTUtils restUtils = new RESTUtils();
		UserPOJO users=new UserPOJO();
		
		String payload=users.getUserPayload();
		
		Response response =restUtils.post(url, payload);
		System.out.println(response.body().asPrettyString());
	}
	
	@Test
	public void addUserUsingMap() {
		String url = "http://localhost:3000/users";

		RESTUtils restUtils = new RESTUtils();
		UserPOJO users=new UserPOJO();
		MapUtils test=new MapUtils();
		Map<String,String> testData=test.getDatainMap();
		String payload=users.getUserPayloadUsingMap(testData);
		
		Response response =restUtils.post(url, payload);
		System.out.println(response.body().asPrettyString());
	}

}
