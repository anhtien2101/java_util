import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khoi tao mot Hashset moi
		HashSet myHashSet = new HashSet<>();
		// Them cac phan tu vao HashSet
		myHashSet.add("2");
		myHashSet.add("7");
		myHashSet.add("5");
		myHashSet.add("9");
		System.out.println("HashSet: " + myHashSet);
		myHashSet.add("2");
		System.out.println("HashSet sau khi chen them 2: " + myHashSet);
		myHashSet.remove("7");
		System.out.println("Sau khi xoa phan tu 7: " + myHashSet);
	}

}
