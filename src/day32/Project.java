package day32;

public class Project {
	public static void main(String[] args) {
		String str = "378282246310005";
		for (char l : str.toCharArray()) {
			System.out.println(l);
			System.out.println((int)l);
	        if (l < 48 || l > 57) {
	        	System.out.println("INVALID");
	        }
		}

	}
}
