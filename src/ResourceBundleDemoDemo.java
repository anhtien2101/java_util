import java.util.ResourceBundle;

public class ResourceBundleDemoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle  bundle = ResourceBundle.getBundle("Demo");
		System.out.println("test: " + bundle.getString("Hello"));
	}

}
