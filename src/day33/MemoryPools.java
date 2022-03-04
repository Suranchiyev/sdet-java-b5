package day33;

public class MemoryPools {
	public static void main(String[] args) {
		// What's String pool memory?
		// It is special memory for String values. 
		// String reuses same values in the string pool.
		// It is possible because String is immutable.
		
		String str = "apple";
		String str1 = "apple";
		System.out.println(str == str1); // true
		
		// All Wrapper classes are immutable
		// All wrapper classes have memory pools similarly as String do
		Integer num = 99;
		Integer num2 = 99;
		Integer num3 = new Integer(99);
		System.out.println(num == num2); // true
		System.out.println(num == num3); // false
	}
}
