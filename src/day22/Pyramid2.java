package day22;

public class Pyramid2 {
	public static void main(String[] args) {
		int num = 5;
		
		/*
		 *     #
		 *    ##
		 *   ###
		 *  ####
		 * #####    
		 */
		
		String p = "#";
		for (int i = 0; i < num; i++) {
			String space = "";
			for (int j = 0; j < num - 1 - i; j++) {
				space += " ";
			}
			
			System.out.println(space + p);
			p += "#";
		}
	}
}
