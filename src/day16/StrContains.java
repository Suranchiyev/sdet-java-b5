package day16;

public class StrContains {
	public static void main(String[] args) {
		// contains(String) is used to check if string contains another string
		// return type of this method is boolean.
		
		String topic = "Varibales, assignment opertors, arithmetic oper";
		
		boolean isThere = topic.contains("assignment");
		System.out.println(isThere);
		
		System.out.println(topic.contains("john"));
		System.out.println(topic.contains("ales"));
		System.out.println(topic.contains("rs, a")); // true
		System.out.println(topic.contains("ment  ")); // false
		
		String str = "Java is cool";
		System.out.println(str.contains("Java is cool")); // true
		System.out.println(str.contains("is")); // true
		System.out.println(str.contains("are")); // false
	}
}
