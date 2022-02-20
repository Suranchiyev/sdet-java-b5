package day28;

public class Project {
	public static void main(String[] args) {
		int row = Integer.parseInt(args[0]);

		String p = "#";
		if (row < 1 || row > 8) {
			System.out.println("INVALID INPUT");
			
		} else {
			for (int i = 0; i < row; i++) {
				
				String space = "";
				for (int j = 0; j < row - i - 1; j++) {
					space += " ";
				}
				
				System.out.println(space + p + "  " + p);
				p += "#";
				
			}
		}
	}
}
