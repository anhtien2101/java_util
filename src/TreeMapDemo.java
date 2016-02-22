import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap myTreeMap = new TreeMap<>();
		myTreeMap.put("t", "tien");
		myTreeMap.put("a", "anh");
		myTreeMap.put("h", "hang");
		myTreeMap.put("d", "dung");
		// lay ra gia tri tuong ung voi key "a"
		String element = (String) myTreeMap.get("a");
		System.out.println("Gia tri tuong ung voi key a: "+ element);
		// lay ra tap hop cac key -> cac key da duoc sap xep theo thu tu
		Set<String> setkey = myTreeMap.keySet();
		System.out.print("Tap hop cac key: " + setkey);
		// lay ra key cuoi cung
		String lastKey = (String) myTreeMap.lastKey();
		System.out.println("\n" + "Key cuoi cung: " + lastKey);
		// lay ra tap hop cac anh xa chua trong map nay
		Set<String> entrySet = myTreeMap.entrySet();
		System.out.println("Tap hop cac anh xa: " + entrySet);
		// Lay ra mot phan map co key nho hon key "h"
		SortedMap headMap = myTreeMap.headMap("h");
		System.out.println("Cac anh xa co key nho hon h: " + headMap);
		// Lay ra tap hop cac gia tri trong map
		Collection values = myTreeMap.values();
		System.out.println("Tap hop cac gia tri trong map: " + values);
		// Lay ra so anh xa trong map
		int number = myTreeMap.size();
		System.out.println("So anh xa trong map: " + number);
	}

}
