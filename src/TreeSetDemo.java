import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khoi tao mot TreeSet
		TreeSet myTreeSet = new TreeSet<>();
		// them cac phan tu vao TreeSet -> tu dong duoc sap xep theo thu tu
		myTreeSet.add("Bo");
		myTreeSet.add("Ga");
		myTreeSet.add("Cho");
		myTreeSet.add("Heo");
		System.out.println("Cac phan tu trong set: " + myTreeSet);
		// Kiem tra xem trong set nay co chua phan tu nao do khong
		boolean hasCho = myTreeSet.contains("Cho");
		if(hasCho == true){
			System.out.println("Set co chua phan tu Cho");
		}
		else{
			System.out.println("Set khong chua phan tu Cho");
		}
		// Lay ra phan tu dau tien cua set
		String firstElement = (String) myTreeSet.first();
		System.out.println("Phan tu dau tien cua set: " + firstElement);
		//xoa bo phan tu trong set
		myTreeSet.remove("Ga");
		System.out.println("Set sau khi xoa Ga: " + myTreeSet);
	}

}
