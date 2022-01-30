package day15;

public class StrSubstring {
	public static void main(String[] args) {
		// Some of the method of String require position of characters.
		// The positions are represented as indexes. 
		// Index starts from 0.
		                  
		//             0123456789
		String java = "Java is fun but sometimes hard.";
		
		System.out.println(java); // Java is fun but sometimes hard.
		
		String javaFun = java.substring(8);
		System.out.println(javaFun); // fun but sometimes hard.
		
		// String is immutable object.
		System.out.println(java); // Java is fun but sometimes hard.
		
		//   = is fun but sometimes hard.
		java = java.substring(5);
		System.out.println(java); // is fun but sometimes hard.
		
		//            0123456789
		String str = "SoftSkills";
		System.out.println(str);
		
		// when substring is used with two indexes
		// -first index is starting point which will include the current index char
		// -second index is ending point. Substring goes till that index exclusive.
		String strSub = str.substring(0, 4);
		System.out.println(strSub); // Soft		
		
		// 0123456789
		// SoftSkills
		System.out.println(str.substring(7, 9)); // ll
		//             0123456789
		String str2 = "Java is cool!";
		System.out.println(str2);
		
		str2 = str2.substring(5, 7);
		System.out.println(str2); // is
		
		//             012345678
		String str3 = "workspace";
		System.out.println("str3: "  + str3);
		
		str3 = str3.substring(0, 4); 
		System.out.println("str3: " + str3); // str3: work
		
		//            012345678910
		String tla = "Tech Lead Academy";
		System.out.println(tla.substring(5, 9));
	}
}







