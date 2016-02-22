import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myArray = new ArrayList<>();
		myArray.add("a");
		myArray.add("t");
		myArray.add("g");
		myArray.add("k");
		myArray.add("b");
		myArray.add("h");
		System.out.println("Mang ban dau: " + myArray);
		// xao tron cac phan tu trong mang
		Collections.shuffle(myArray);
		System.out.println("Mang sau khi xao tron: " + myArray);
		// dao nguoc cac phan tu trong mang
		Collections.reverse(myArray);
		System.out.println("Mang sau khi dao nguoc: " + myArray);
		// thay the phan tu trong mang
		Collections.replaceAll(myArray, "t", "tien");
		System.out.println("Mang sau khi duoc thay the chu 't' bang chu 'tien': " + myArray);
		Collections.swap(myArray, 1, 3); // swap b voi h
		System.out.println("Mang sau khi swap: " + myArray);
	}

}
