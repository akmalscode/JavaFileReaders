package propertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.setProperty("name", "Akmal");
		properties.setProperty("email", "akmal@gmail.com");
		properties.setProperty("age", "43");

		String filePath = System.getProperty("user.dir") + "/data/mydata.properties";

		FileOutputStream fos = new FileOutputStream(filePath);

		properties.store(fos, "Sample data in properties file");

		fos.close();

		System.out.println("Properties have beeb written into" + filePath);

	}

}
