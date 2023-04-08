package utilityclasses;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
	
	public Map<String,String> getDatainMap() {
		Map<String,String> testData=new HashMap<>();
		testData.put("buildingNumber", "M-22");
		testData.put("landmark", "faran");
		return testData;
	}
}
