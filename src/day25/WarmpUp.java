package day25;

public class WarmpUp {
	// Prime number
	public static void main(String[] args) {
		System.out.println(isPrime(3)); // true
		System.out.println(isPrime(7)); // true
		System.out.println(isPrime(4)); // false
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(22)); // false
		System.out.println(isPrime(2)); // true
	}
	
	/*
	 * The prime number is a number greater than 1
	 * and evenly divisible by 1 and itself only.
	 * 
	 * isPrime(3); // true
	 * isPrime(7); // true
	 * isPrime(4); // false
	 * isPrime(19); // true
	 */
	public static boolean isPrime(int num) {
		// 1. By using for loop try each number till half of the num
		for (int i = 2; i <= num / 2; i++) {
			// 2. if we can divide num evenly by i then return false
			if (num % i == 0) {
				return false;
			}
		}
		
		// 3. if it didn't return false from the loop, we say number is prime.
		return true;
	}
}
