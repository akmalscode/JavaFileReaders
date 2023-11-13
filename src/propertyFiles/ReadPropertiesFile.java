package propertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();

		String filePath = System.getProperty("user.dir") + "/data/mydata.properties";

		FileInputStream fis = new FileInputStream(filePath);

		properties.load(fis);

		fis.close();

		// Read data from properties file

		String Name = properties.getProperty("name");
		String Age = properties.getProperty("age");
		String Email = properties.getProperty("email");

		System.out.println("Name is: " + Name + " Age is: " + Age + " Email is: " + Email);

		// capture all the properties approach 1
		Set<String> keys = properties.stringPropertyNames();
		System.out.println(keys);

		// capture all the properties approach 2
		Set<Object> allkeys = properties.keySet();
		System.out.println(allkeys);

		// capture all the properties approach 3
		Collection<Object> keyValue = properties.values();
		System.out.println(keyValue);
		
		//read all the properties and their values using iterative 
		for(String alkeys:properties.stringPropertyNames()) {
			System.out.println(alkeys+"="+properties.getProperty(alkeys));
		}
		
	}

}
