package testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testBase.TestBase;
import utilityclasses.ReadPropertiesFile;
import utilityclasses.TestUserManagement;
import utilityclasses.URLGenerator;

public class TestCases extends TestBase {

	@Test
	public void getUsers() throws IOException {
		Properties props=ReadPropertiesFile.loadProperty("config");
		String baseURL=props.getProperty("baseURL");
		URLGenerator setUrl=new URLGenerator(baseURL);
		String url = setUrl.getSpecificUser+2;
		Response response = restUtils.get(url);
		System.out.println("-------------------come from testcase class-------------------");
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.body().asPrettyString());
		JsonPath jp=new JsonPath(response.asString());
		String actual=jp.getString("addressDetails.officeAdress.cardId");
		//Assert.assertEquals(actual, "EMP-002");
		System.out.println(actual+" "+TestUserManagement.validateField("cardId"));
		//Assert.assertEquals(actual, TestUserManagement.validateField("cardId"));
	}

	@Test
	public void getUserswithSingleQueryParams() {
		String url = "http://localhost:3000/users";
		String key = "id";
		int value = 2;

		// RESTUtils restUtils = new RESTUtils();
		Response response = restUtils.getWithQueryParams(url, key, value);

		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void getUserswithMultipleQueryParams() {
		String url = "http://localhost:3000/users";

		// RESTUtils restUtils = new RESTUtils();

		Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("name", "Gagan");

		Response response = restUtils.getWithMultipleQueryParams(url, map);

		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void addUser() {
		String url = "http://localhost:3000/users";

		// RESTUtils restUtils = new RESTUtils();
		// UserPOJO users=new UserPOJO();

		String payload = users.getUserPayload();

		Response response = restUtils.post(url, payload);
		System.out.println(response.body().asPrettyString());
	}

	@Test
	public void addUserUsingMap() {
		String url = "http://localhost:3000/users";

		// RESTUtils restUtils = new RESTUtils();
		// UserPOJO users=new UserPOJO();
		// MapUtils test=new MapUtils();
		Map<String, String> testData = mapData.getDatainMap();
		String payload = users.getUserPayloadUsingMap(testData);

		Response response = restUtils.post(url, payload);
		System.out.println(response.body().asPrettyString());
	}

}
