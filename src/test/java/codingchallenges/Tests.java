package codingchallenges;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Tests extends TestBase {

	public static int id=2;
	
	@Test
	void createUser() {
		String url = "http://localhost:3000/users";
		Map<String, Object> getValues = utils.getDetails();
		String payload = user.payload(getValues);
		// System.out.println(expected);
		Response response = utils.post(url, payload);
		response.prettyPrint();
		
		JsonPath jp=new JsonPath(response.asString());
		id=jp.getInt("id");

		// --print--------
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

		// --all validations-------
		Assert.assertTrue(response.getTime() < 500);
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 201 Created");
		
	}
	
	@Test
	void getUser() {
		String url = "http://localhost:3000/users/"+id;
		Response response=utils.get(url);
		System.out.println(response.asPrettyString());
		Headers headers= response.headers();
		System.out.println("------------------------------");
//		for(Header h:headers) {
//			System.out.println(h.getName()+" "+h.getValue());
//		}
//		System.out.println(response.header("Content-Type"));
//		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		
		JsonPath jp=new JsonPath(response.asString());
		System.out.println(jp.getString("name"));
		System.out.println(jp.getString("addressDetails.landmark"));
		System.out.println(jp.getString("addressDetails.officeAdress.cardId"));
	}
	
	

}
