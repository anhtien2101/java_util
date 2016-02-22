import java.util.ArrayDeque;

public class MyArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khoi tao ArrayDeque
		ArrayDeque<String> myArrayDeque = new ArrayDeque<>();
		// Chen phan tu: chen vao cuoi mang
		myArrayDeque.add("xoai");
		myArrayDeque.add("oi");
		System.out.println("Mang sau khi chen: " + myArrayDeque);
		// chen vao dau mang
		myArrayDeque.addFirst("cam");
		System.out.println("Mang sau khi chen vao dau mang: " + myArrayDeque);
		// lay ra phan tu cuoi cua mang
		String lastElement = myArrayDeque.getLast();
		System.out.println("Phan tu cuoi cua mang: " + lastElement);
		// dung pop, lay ra phan tu dau mang
		String popElement = myArrayDeque.pop();
		System.out.println("Phan tu pop: " + popElement);
	}
}
