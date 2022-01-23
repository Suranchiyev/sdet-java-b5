package day12;

public class Terminal {
	public static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("windows");
	
	public static void main(String[] args) {
		// ternary operator
		// 1. ternary operator always returns some value
		//                     condition  ? value if true : value if false
		
		String terminalToUse = IS_WINDOWS ? "git bush" : "regular terminal";
		
//		if (IS_WINDOWS) {
//			terminalToUse = "git bush";
//		} else {
//			terminalToUse = "regular terminal";
//		}
		
		System.out.println("OS: " + System.getProperty("os.name"));
		
		System.out.println(terminalToUse);
	}
	
}
