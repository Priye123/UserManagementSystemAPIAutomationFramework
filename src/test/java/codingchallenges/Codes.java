package codingchallenges;

import org.json.JSONArray;
import org.json.JSONException;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class Codes {

	static String str = "[\r\n" + "    {\r\n" + "        \"name\": \"Mukesh\",\r\n" + "        \"dob\": \"1990-04-23\",\r\n"
			+ "        \"addressDetails\": {\r\n" + "            \"houseNumber\": \"L-38\",\r\n"
			+ "            \"aadharNumber\": 32700,\r\n" + "            \"addressLine1\": \"Terminal-1\",\r\n"
			+ "            \"addressLine2\": \"Terminal-2\",\r\n" + "            \"landmark\": \"Bank\",\r\n"
			+ "            \"pin\": 67,\r\n" + "            \"officeAdress\": {\r\n"
			+ "                \"buildingNumber\": 7.8,\r\n" + "                \"addressLine1\": \"Bam Nagar\",\r\n"
			+ "                \"addressLine2\": \"Jama Masjid\",\r\n"
			+ "                \"landmark\": \"Bus Stand\",\r\n" + "                \"cardId\": \"EMP-002\"\r\n"
			+ "            }\r\n" + "        },\r\n" + "        \"id\": 2\r\n" + "    },\r\n" + "    {\r\n"
			+ "        \"name\": \"Mohan\",\r\n" + "        \"dob\": \"1979-12-30\",\r\n"
			+ "        \"homeAddress\": {\r\n" + "            \"houseNumber\": \"E-89\",\r\n"
			+ "            \"aadharNumber\": 45987,\r\n" + "            \"addressLine1\": \"Yamuna Nagar\",\r\n"
			+ "            \"addressLine2\": \"Ganga\",\r\n" + "            \"landmark\": \"Duty\",\r\n"
			+ "            \"pin\": 69,\r\n" + "            \"officeadress\": {\r\n"
			+ "                \"buildingNumber\": 34.5,\r\n" + "                \"addressLine1\": \"Langar\",\r\n"
			+ "                \"addressLine2\": \"Haoda\",\r\n" + "                \"landmark\": \"Marty Nagar\",\r\n"
			+ "                \"cardId\": \"EMP-004\"\r\n" + "            }\r\n" + "        },\r\n"
			+ "        \"id\": 3\r\n" + "    },\r\n" + "    {\r\n" + "        \"name\": \"chaman\",\r\n"
			+ "        \"dob\": \"2000-05-24\",\r\n" + "        \"addressDetails\": {\r\n"
			+ "            \"houseNumber\": \"L-38\",\r\n" + "            \"aadharNumber\": 32700,\r\n"
			+ "            \"addressLine1\": \"Terminal-1\",\r\n" + "            \"addressLine2\": \"Terminal-2\",\r\n"
			+ "            \"landmark\": \"Mandir\",\r\n" + "            \"pin\": 54,\r\n"
			+ "            \"officeAdress\": {\r\n" + "                \"buildingNumber\": 5.2,\r\n"
			+ "                \"addressLine1\": \"Carol Bagh\",\r\n"
			+ "                \"addressLine2\": \"Jama Masjid\",\r\n"
			+ "                \"landmark\": \"Bus Stand\",\r\n" + "                \"cardId\": \"EMP-001\"\r\n"
			+ "            }\r\n" + "        },\r\n" + "        \"id\": 4\r\n" + "    },\r\n" + "    {\r\n"
			+ "        \"name\": \"Priye\",\r\n" + "        \"dob\": \"1998-01-05\",\r\n"
			+ "        \"addressDetail\": {\r\n" + "            \"houseNumber\": \"MIG_89\",\r\n"
			+ "            \"aadharNumber\": 567438,\r\n" + "            \"addressLine1\": \"Jam Nagar\",\r\n"
			+ "            \"addressLine2\": \"Hari Sadan\",\r\n" + "            \"landmark\": \"School\",\r\n"
			+ "            \"pin\": 846001,\r\n" + "            \"officeAddres\": {\r\n"
			+ "                \"buildingNumber\": 14.75,\r\n"
			+ "                \"addressLine1\": \"Salim Nagar\",\r\n"
			+ "                \"addressLine2\": \"Hope Pul\",\r\n" + "                \"landmark\": \"Air Port\",\r\n"
			+ "                \"cardId\": \"EMP-60942\"\r\n" + "            }\r\n" + "        },\r\n"
			+ "        \"id\": 6\r\n" + "    }\r\n" + "]";

	@Test
	void UserCount() {
		JSONArray ja=new JSONArray(str);
		System.out.println(ja.length());
	}
	
	@Test
	void buildingNumberAdd() {
		JSONArray ja=new JSONArray(str);
		System.out.println(ja.getJSONObject(0));
//		double count=0;
//		
//		for(int i=0;i<ja.length();i++) {
//			try {
//				count=count+ja.getJSONObject(i).getJSONObject("addressDetails").getJSONObject("officeAdress").getDouble("buildingNumber");
//			} catch (JSONException e) {
//				
//			}
//		}
//		System.out.println(count);
	}

}
