package utilityclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static Properties loadProperty(String fileName) throws IOException {
		Properties props = new Properties();
		String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + fileName + ".properties";
		File location = new File(filePath);
		FileInputStream fis = new FileInputStream(location);
		props.load(fis);
		return props;
	}

}
