package day15;

public class StrSubstring2 {
	public static void main(String[] args) {
		//             0123456789
		String str  = "HelloWorld"; // loW
		String str1 = "SDLC"; // DL
		String str2 = "Sublime"; // bl
		String str3 = "Window"; // ind
		String str4 = "OptimizePDF"; // PDF
		String str5 = "Navigate"; // Nav
		String str6 = "Search"; // ear
		
		System.out.println(str.substring(3, 6)); // loW
		System.out.println(str1.substring(1, 3)); // DL
		System.out.println(str2.substring(2, 4)); // bl
		System.out.println(str3.substring(1, 4)); // ind
		System.out.println(str4.substring(8)); // PDF
		System.out.println(str5.substring(0, 3)); // Nav
		System.out.println(str6.substring(1, 4)); // ear
		
		//             012345
		String name = "John";
		// name = name.substring(9); // IndexOutOfBoundsException
		// name = name.substring(-1); // IndexOutOfBoundsException
		System.out.println(name);
	} 
}
