import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao mot mang moi
		LinkedList<String> myLinkedList = new LinkedList<>();
		// them cac phan tu vao mang
		myLinkedList.add("a");
		myLinkedList.add("b");
		// in ra mang
		System.out.println("Mang sau khi chen: " + myLinkedList);
		// them phan tu vao mot vi tri cu the
		myLinkedList.add(1, "d");
		System.out.println("Mang sau khi chen them d vao vi tri so 1: " + myLinkedList);
		// chem them vao vi tri dau tien cua mang
		myLinkedList.addFirst("first");
		System.out.println("Sau khi chen vao vi tri dau tien: " + myLinkedList);
		// chen vao vi tri cuoi cung cua mang
		myLinkedList.addLast("last");
		System.out.println("Sau khi chen vao vi tri cuoi cung: " + myLinkedList);
		// lay ra phan tu dau tien cua mang
		String first = myLinkedList.getFirst();
		System.out.println("Phan tu dau tien cua mang: " + first);
		// xoa bo phan tu cuoi cung cua mang
		myLinkedList.removeLast();
		System.out.println("Sau khi xoa phan tu cuoi cung cua mang: " + myLinkedList);
		// push 1 phan tu vao mang
		myLinkedList.push("dautien");
		System.out.println("Mang sau khi push: " + myLinkedList);
		// pop phan tu dau tien ra
		String popElement = myLinkedList.pop();
		System.out.println("Phan tu pop ra: " + popElement);
	}
}
