import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao mot Hashtable
		Hashtable myHashtable = new Hashtable();
		// them cac phan tu vao Hashtable
		myHashtable.put("t", "CNTT");
		myHashtable.put("i","Moi Truong");
		myHashtable.put("e", "Dia Chat");
		myHashtable.put("n", "Marketing");
		// tim xem co gia tri "Kinh doanh" trong map khong
		boolean isExist = myHashtable.containsValue("Kinh doanh");
		if (isExist) {
			System.out.println("Ton tai gia tri Kinh doanh trong map");
		}
		else {
			System.out.println("Khong ton tai gia tri Kinh doanh trong map");
		}
		// lay gia tri tuong ung voi key la "t"
		String element = (String) myHashtable.get("t");
		System.out.println("Gia tri tuong ung voi key t: " + element);
		// lay ra tap hop key
		Set<String> listKey = myHashtable.keySet();
		System.out.println("Tap hop key: " + listKey);
		// duyet map de lay ra het ca  gia tri
		for (String i:listKey) {
			System.out.println(i + ": " + myHashtable.get(i));
		}
	}
}
