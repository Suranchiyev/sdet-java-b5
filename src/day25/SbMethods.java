package day25;

public class SbMethods {
	public static void main(String[] args) {
		// StringBuilder does support most of the String methods
		// and it has it is own methods.
		// charAt(), length(), indexOf(), substring(), equals
		//                                     0123456
		StringBuilder day = new StringBuilder("Tuesday");
		System.out.println(day); // Tuesday
		System.out.println(day.length()); // 7
		
		char ch = day.charAt(0);
		System.out.println(ch); // T
		
		int i = day.indexOf("y");
		System.out.println(i); // 6
		
		// substring will return String
		String str = day.substring(0, 3);
		System.out.println(str);
		System.out.println("--------------");
		
		StringBuilder sb = new StringBuilder();
		//         0123456
		sb.append("animals");
		System.out.println(sb);
		
		// insert(index, string); it inserts the specific string in the given
		// index.The char in that index will be pushed to the right.
		sb.insert(3, "-");
		System.out.println(sb); // ani-mals
		
		sb.insert(0, "?");      // 012345678
		System.out.println(sb); // ?ani-mals -> ?ani-ma=ls
		
		sb.insert(7, "=");
		System.out.println(sb); // ?ani-ma=ls
		
		sb.insert(sb.length(), "abc");
		System.out.println(sb); // ?ani-ma=lsabc
		System.out.println("----------------");
		
		// delete(start, end); 
		// removes characters from start(included) till end(exluded)
		//                                     012345
		StringBuilder sb2 = new StringBuilder("abcdef");
		System.out.println(sb2); // abcdef
		
		sb2.delete(1, 3);        // 0123
		System.out.println(sb2); // adef
		
		sb2.delete(1, 2);
		System.out.println(sb2); // aef
		
		StringBuilder sb3 = new StringBuilder();
		//          012345678
		sb3.append("123456789");
		// TODO delete chars from sb3 so sb3 will have value as "19"
		sb3.delete(1, sb3.length() - 1);
		System.out.println(sb3); // 19
		
		// deleteCharAt(index) //              01234
		StringBuilder sb4 = new StringBuilder("apple");
		System.out.println(sb4);
		sb4.deleteCharAt(3); // it will delete char under the provided index.
		System.out.println(sb4);
		System.out.println("-------------------");
		
		// reverse
		StringBuilder sb5 = new StringBuilder("Wooden Spoon");
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5);	
	}
}





