import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tao mot ArrayList de duyet
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hong");
		arr.add("ha");
		arr.add("hoa");
		arr.add("hue");
		arr.add("hang");
		
		// dung iterator de duyet mang, in ra cac phan tu trong mang
		System.out.print("Mang duoc duyet xuoi: ");
		Iterator iterator = arr.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.print(element + "; ");
		}
		
		// remove phan tu cuoi cung cua mang
		iterator.remove();
		System.out.println("\nMang sau khi bi xoa: " + arr);
		
		// duyet mang theo chieu nguoc lai
		ListIterator<String> listIterator = arr.listIterator();
		// sua doi cac phan tu trong mang
		while (listIterator.hasNext()) {
			Object element1 = listIterator.next();
			listIterator.set("SV " + element1);
		}
		System.out.println("Mang sau khi duoc sua doi: " + arr);
	}
}
