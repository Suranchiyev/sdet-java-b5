package day10;

public class LogicalOperators {
	public static void main(String[] args) {
		// && - logical AND
		// || - logical OR
		// AND and OR connect logical conditions together.
		
		// !  - logical NOT
		
		int num = 20;
		
		// check if number is between 10 and 50 exclusive
		//                20 > 10 AND 20 < 50
		boolean inRange = num > 10 && num < 50;
		System.out.println("in range: " + inRange);
		// When we use logical AND - && all conditions should be true
		// in order to get true for whole expression. If even one condition is false
		// the whole expression is false.
		
		// make it true if number is 20 or 10 or 7
		boolean isOurNumber = num == 20 || num == 10 || num == 7;
		System.out.println("is out number: " + isOurNumber);
		// When we use logical OR - || as long as one condition is true, the whole
		// expression will be true.
		
		// NOT - ! it will reverse the logical value. 
		boolean isGood = false;
		System.out.println(isGood); // false
		isGood = !isGood;
		System.out.println(isGood); // true
		
		System.out.println("NOT 1: " + !true);
		System.out.println("NOT 2: " + !false);
		
		/*
		 *    
		 * false || true || false => 1. true
		 * true && true           => 2. true
		 * false && true && true  => 3. false
		 * !false                 => 4. true
		 * !true                  => 5. false
		 */
		System.out.println(false || true || false);
		System.out.println(true && true);
		System.out.println(false && true && true);
		System.out.println(!false);
		System.out.println(!true );
		
		System.out.println("------");
		//                    f     OR  (t)
		System.out.println((2 == 1) || (true && 4 >= 3)); // true
		//                    t   AND t AND t
		System.out.println(!false && true && 5 > 3); // true
		//                   f    OR        f  
		System.out.println(8 == 9 || false && 3 < 99); // false
		//                    f  OR  t
		System.out.println(false || true && true && 4 % 2 == 0); // true
	}
}






