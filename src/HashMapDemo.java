import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap myHashMap = new HashMap();
		myHashMap.put("a", "toan");
		myHashMap.put("b", "ly");
		myHashMap.put("c", "van");
		myHashMap.put("d", "su");
		myHashMap.put("e", "dia");
		// lay ra gia tri co key la 2
		String element = (String) myHashMap.get("b");
		System.out.println("Phan tu ung voi key la b: " + element);
		// lay ra tap hop cac key chua trong map
		Set<String> listKey = myHashMap.keySet();
		System.out.println("tap hop key" + listKey);
		// duyet map de lay ra het cac phan tu trong no
		System.out.println("Duyet cac phan tu trong map: ");
		for (String i:listKey) {
			System.out.println(i + ": " + myHashMap.get(i));
		}
	}
}
