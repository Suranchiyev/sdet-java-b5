package day44;

public class BoxDemo {
	public static void main(String[] args) {
		ArrayBox box = new ArrayBox();
		box.putInside("apple");
		box.putInside("banana");
		box.putInside("kiwi");
		box.putInside("orange");
		
		System.out.println(box.getNumberOfItems());
		System.out.println(box.getItem(0));
		System.out.println(box.getItems());
	}
}
