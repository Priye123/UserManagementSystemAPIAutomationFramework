package utilityclasses;
import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RESTUtils {

	
	public Response get(String url) {
		Response response= given()
			.contentType(ContentType.JSON).log().all()
		.when()
			.get(url);
		
		return response;
	}
	
	public Response getWithQueryParams(String url,String key,int value) {
		Response response= given()
			.queryParams(key, value)
			.contentType(ContentType.JSON).log().all()
		.when()
			.get(url);
		
		return response;
	}
	
	public Response getWithMultipleQueryParams(String url,Map<String,Object> map) {
		Response response= given()
			.queryParams(map)
			.contentType(ContentType.JSON).log().all()
		.when()
			.get(url);
		
		return response;
	}
	
	
	public Response post(String url,String payload) {
		return given()
			.contentType(ContentType.JSON).log().all()
			.body(payload)
		.when()
			.post(url);
			
	}
	
	
	
	
	
	
	
	
	
	
}
