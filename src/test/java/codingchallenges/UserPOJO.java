package codingchallenges;

import java.util.Map;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPOJO extends TestBase {

	private String name;
	private String dob;
	private AddressDetails addressDetail;

	public String payload(Map<String, Object> testData) {
		user.setName(testData.get("name").toString());
		user.setDob(testData.get("dob").toString());

		addressDetails.setHouseNumber(testData.get("houseNumber").toString());
		addressDetails.setAadharNumber(Integer.parseInt(testData.get("aadharNumber").toString()));
		addressDetails.setAddressLine1(testData.get("addressLine1").toString());
		addressDetails.setAddressLine2(testData.get("addressLine2").toString());
		addressDetails.setLandmark(testData.get("landmark").toString());
		addressDetails.setPin(Integer.parseInt(testData.get("pin").toString()));

		officeAddress.setBuildingNumber(Double.parseDouble(testData.get("buildingNumber").toString()));
		officeAddress.setAddressLine1(testData.get("addressLine11").toString());
		officeAddress.setAddressLine2(testData.get("addressLine22").toString());
		officeAddress.setLandmark(testData.get("landmark1").toString());
		officeAddress.setCardId(testData.get("cardId").toString());

		addressDetails.setOfficeAddres(officeAddress);
		user.setAddressDetail(addressDetails);

		Gson gson = new Gson();

		return gson.toJson(user);

	}
}
