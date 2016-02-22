import java.util.Properties;
import java.util.Set;

public class PropertiesDemoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khoi tao mot properties
		Properties myProperties = new Properties();
		myProperties.put("t", "toan");
		myProperties.put("l", "ly");
		myProperties.put("v", "van");
		myProperties.put("a", "anh");
		myProperties.put("s", "su");
		System.out.println("properties: " + myProperties);
		// lay gia tri tuong ung voi key a
		String valueOfa = myProperties.getProperty("a");
		System.out.println("Gia tri tuong ung voi key a: " + valueOfa);
		Set setKey = myProperties.keySet();
		System.out.println("Tap hop cac key: " + setKey);
	}

}
