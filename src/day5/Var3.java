package day5;

public class Var3 {
	public static void main(String[] args) {
		// variable is container that can hold a data.
		// - for different type of data there is different variables.
		// - we need to declare(create) a variable before using it.
		
		// String is sequence of characters between double quotes.

		String str = "apple";
		// String - data type
		// str - name of variable.
		// "apple" - value of variable.
		System.out.println(str); // apple
		
		// we can reassign variable with new value by using `=` operator.
		str = "orange";
		System.out.println(str); // orange

		String str1 = str;
		System.out.println(str); // orange
		System.out.println(str1); // orange
		
		String str2 = str;
		System.out.println(str2); // orange
		
		str = "hello";
		str1 = "class";
		
		System.out.println(str + str1); // helloclass
		// String concatenation is when we can join to strings together by using '+' operator.
		
		//   "hello" + ", "  + "class" + "!"
		str2 = str + ", " + str1 + "!";
		System.out.println(str2); // hello, class!
		
		String word1 = "Java";
		String word2 = "awesome";
		
		System.out.println(word1 + word2); // Javaawesome
		System.out.println(word1 + " is " + word2 + "!"); // Java is awesome!
		
		// \n \t \" \\
		System.out.println(word1 + "\n" + word2);
	}
}
