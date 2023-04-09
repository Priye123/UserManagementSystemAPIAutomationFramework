package testBase;

import org.testng.annotations.BeforeMethod;

import pojoclasses.HomeAddressPOJO;
import pojoclasses.OfficeAddressPOJO;
import pojoclasses.UserPOJO;
import utilityclasses.MapUtils;
import utilityclasses.RESTUtils;

public class TestBase extends ObjectsRepo {

	@BeforeMethod
	public void Setup() {
		restUtils = new RESTUtils();
		users = new UserPOJO();
		homeAddress = new HomeAddressPOJO();
		officeAddress = new OfficeAddressPOJO();
		mapData = new MapUtils();
	}

}
