package day17;

public class StrStartsEndsWith {
	public static void main(String[] args) {
		// startsWith(String) - it checks if string starts with another string.
		
		String str = "Java is object oriented programming language";
		
		System.out.println(str.startsWith("Java is obj")); // true
		System.out.println(str.startsWith("is object")); // false
		
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("java")); // false
		System.out.println(str.startsWith("Java is object oriented programming language")); // true
		
		boolean starts = str.startsWith("programming");
		
		// endsWith - it checks if string ends with another string.
		System.out.println("-------");
		String str2 = "Selenium is web automation tool";
		boolean ends = str2.endsWith("ool"); 
		System.out.println(ends); // true
		
		System.out.println(str2.endsWith("Selenium is web automation tool")); // true
	}
}
