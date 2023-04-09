package codingchallenges;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Utils {

	public Map<String, Object> getDetails() {

		Map<String, Object> map = new LinkedHashMap<>();
		map.put("name", "Priye");
		map.put("dob", "1998-01-05");
		map.put("houseNumber", "MIG_89");
		map.put("aadharNumber", 567438);
		map.put("addressLine1", "Jam Nagar");
		map.put("addressLine2", "Hari Sadan");
		map.put("landmark", "School");
		map.put("pin", 846001);
		map.put("buildingNumber", 14.75);
		map.put("addressLine11", "Salim Nagar");
		map.put("addressLine22", "Hope Pul");
		map.put("landmark1", "Air Port");
		map.put("cardId", "EMP-60942");

		return map;

	}

	public Response post(String url, String payload) {
		return given().contentType(ContentType.JSON).log().all().body(payload).when().post(url);
	}
	
	public Response get(String url) {
		return given().contentType(ContentType.JSON).when().get(url);
	}
}
