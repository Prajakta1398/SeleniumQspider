package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties property=new Properties();
		FileInputStream fis=new FileInputStream("./configuration.properties");
		property.load(fis);
		String value=property.getProperty("name");
		System.out.println(value);
	}
}
