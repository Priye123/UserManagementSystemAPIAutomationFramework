package pojoclasses;

import java.util.Map;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPOJO {

	private String name;
	private String dob;
	private HomeAddressPOJO homeAddress;

	public String getUserPayload() {
		UserPOJO user=new UserPOJO();
		
		user.setName("Mohan");
		user.setDob("1979-12-30");
		
		HomeAddressPOJO homeAddress=new HomeAddressPOJO();
		homeAddress.setHouseNumber("E-89");
		homeAddress.setAadharNumber(45987);
		homeAddress.setAddressLine1("Yamuna Nagar");
		homeAddress.setAddressLine2("Ganga");
		homeAddress.setLandmark("Duty");
		homeAddress.setPin(69);
		
		OfficeAddressPOJO officeAddress=new OfficeAddressPOJO();
		officeAddress.setBuildingNumber(34.5);
		officeAddress.setAddressLine1("Langar");
		officeAddress.setAddressLine2("Haoda");
		officeAddress.setLandmark("Marty Nagar");
		officeAddress.setCardId("EMP-004");
		
		homeAddress.setOfficeadress(officeAddress);
		
		user.setHomeAddress(homeAddress);
		
		//user java object can be converted to JsonString using gson library
		Gson gson=new Gson();
		return gson.toJson(user);
	}
	
	public String getUserPayloadUsingMap(Map<String,String> testData) {
		UserPOJO user=new UserPOJO();
		
		OfficeAddressPOJO officeAddress=new OfficeAddressPOJO();
		officeAddress.setBuildingNumber(Double.parseDouble(testData.get("buildingNumber")));
		officeAddress.setLandmark(testData.get("landmark"));
		
		Gson gson=new Gson();
		return gson.toJson(user);
	}

}
