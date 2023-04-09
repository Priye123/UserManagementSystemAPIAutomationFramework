package utilityclasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class TestUserManagement {

	
	public static String validateField(String field) throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		String filePath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\userManagement\\userManagementTest.json";
		JsonParser jp = new JsonParser();
		JsonElement jsonElement = jp.parse(new FileReader(filePath));
		JsonObject object = jsonElement.getAsJsonObject();
		JsonElement ele = object.get("addUser");
		JsonObject jObject = ele.getAsJsonObject();
		Map<String, String> mObject = new HashMap<>();

		Iterator iterator = jObject.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			mObject.put(entry.getKey().toString(), entry.getValue().toString());
		}

		//System.out.println(mObject.get("cardId"));
		return mObject.get(field).toString();
	}
}
