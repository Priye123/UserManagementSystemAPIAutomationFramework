package codingchallenges;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDetails {

	private String houseNumber;
	private int aadharNumber;
	private String addressLine1;
	private String addressLine2;
	private String landmark;
	private int pin;
	private OfficeAddress officeAddres;
}
