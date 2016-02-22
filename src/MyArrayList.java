import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tao mot mang moi
		ArrayList<String> myArray = new ArrayList<>();
		// them phan tu vao mang
		myArray.add("meo");
		myArray.add("ga");
		myArray.add("cho");
		myArray.add("heo");
		System.out.print("Mang sau khi add cac phan tu: " + myArray);
		// lay chieu dai cua mang
		int size = myArray.size();
		System.out.println("\n" + "Chieu dai mang: " + size);
		// lay ra phan tu thu 2 (chi so bat dau tu 0)
		String secondElement = myArray.get(2);
		System.out.println("Phan tu thu 2: " + secondElement);
		// xoa phan tu thu 1
		myArray.remove(1);
		System.out.print("Mang sau khi xoa phan tu thu 1: " + myArray);
		// thay the phan tu thu 2 la "bo"
		myArray.set(2, "bo");
		System.out.print("\n" + "Mang sau khi thay the: " + myArray);
		
	}
}
