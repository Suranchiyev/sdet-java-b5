package day16;

public class StrEquals {
	public static void main(String[] args) {
		// To compare two Strings on equality we .equals() method.
		// It will return true if they are equal.
		
		String box = "apple";
		String box1 = "apple";
		
		if (box.equals(box1)) {
			System.out.println(box + " and " + box1 + " are equal");
		} else {
			System.out.println(box + " is not equal to " + box1);
		}
		
		// Never use == for String comparison.
		System.out.println(box == box1);
		
		// Always use .equals method
		System.out.println(box.equals(box1));
		
		String name = "John";
		String name2 = new String("John");
		System.out.println(name); // John
		System.out.println(name2); // John
		
		System.out.println(name == name2); // false
		System.out.println(name.equals(name2)); // true
	}
}
