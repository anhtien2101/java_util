import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> myVector = new Vector<>();
		// chen phan tu vao mang
		myVector.addElement(7);
		myVector.addElement(9);
		System.out.println("mang sau khi chen: " + myVector);
		// chen so 10 vao vi tri so 1
		myVector.insertElementAt(10, 1);
		System.out.println("mang sau khi chen so 10: " + myVector);
		// sap xep lai mang
		myVector.sort(null);
		System.out.println("mang sau khi sort: " + myVector);
		// lay phan tu tai vi tri so 2
		int twoElement = myVector.elementAt(2);
		System.out.println("Phan tu tai vi tri so 2: " + twoElement);
	}
}
