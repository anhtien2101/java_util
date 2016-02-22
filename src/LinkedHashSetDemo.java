import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("c");
		linkedHashSet.add("E");
		linkedHashSet.add("t");
		linkedHashSet.add("B");
		System.out.println("LinkedHashSet: " + linkedHashSet);
		boolean hasT = linkedHashSet.contains("T");
		if(hasT == true){
			System.out.println("Co chua T");
		}
		else{
			System.out.println("Khong chua T");
		}
	}

}
