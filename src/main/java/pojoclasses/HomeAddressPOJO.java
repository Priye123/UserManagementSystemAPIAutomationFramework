package pojoclasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeAddressPOJO {

	private String houseNumber;
	private int aadharNumber;
	private String addressLine1;
	private String addressLine2;
	private String landmark;
	private int pin;
	private OfficeAddressPOJO officeadress;
	
	
}
