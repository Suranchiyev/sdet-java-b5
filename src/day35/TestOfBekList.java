package day35;

public class TestOfBekList {
	public static void main(String[] args) {
		BekList list = new BekList();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(7);
		
		System.out.println(list);
		
		list.add(9);
		System.out.println(list);
		
		System.out.println(list.get(3));
	}
}
