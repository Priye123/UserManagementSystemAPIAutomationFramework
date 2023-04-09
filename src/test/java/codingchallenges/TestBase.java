package codingchallenges;

import org.testng.annotations.BeforeMethod;

public class TestBase extends ObjectRepo {

	@BeforeMethod
	public void setUp() {
		user=new UserPOJO();
		addressDetails=new AddressDetails();
		officeAddress=new OfficeAddress();
		utils=new Utils();
	}
	
}
