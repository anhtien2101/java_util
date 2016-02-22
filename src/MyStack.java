import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> myStack = new Stack<>();
		System.out.println("Stack sau khi moi khoi tao: " + myStack);
		// push phan tu vao stack
		myStack.push(10);
		myStack.push(7);
		System.out.println("Stack sau khi push cac phan tu: " + myStack);
		// lay phan tu ra bang peek, lay ra phan tu cuoi ma khong xoa trong stack
		int peekElement = myStack.peek();
		System.out.println("Phan tu peek ra: " + peekElement);
		// tim vi tri cua phan tu 7
		int index = myStack.search(7);
		System.out.println("vi tri so 7: " + index);
	}
}
