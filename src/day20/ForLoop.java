package day20;

public class ForLoop {
	public static void main(String[] args) {
		// while loops is used when we don't know exact number of iterations in
		// advance.
		// for loops are good when we know exact number of iterations.
		
		// for (init part; condition; update action) {
		// 		body of loop
		// }
		// init part - where we initialize a variable counter variable that will be used in the
		//             loop
		// condition     - if it is true keep running the loop, otherwise stop.
		// update action - in this part we usually change the variable that used in
		//                 the  condition part that it will be false at some point.
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". Hello, World!");
		}
		
	}
}
