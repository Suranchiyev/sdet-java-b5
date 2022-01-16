package day7;

public class IncAndDecOper {
	public static void main(String[] args) {
		int num = 19;
		//     19 + 1
		num = num + 1;
		System.out.println("Original way: " + num); // 20
		
		// post increment operator will increase value by 1
		num++; 
		System.out.println("Post increment: " + num); // 21
		
		// post decrement operator will decrease value by 1
		num--;
		System.out.println("Post decrement: " + num); // 20
		
		++num;
		System.out.println("Pre increment: " + num); // 21
		
		--num;
		System.out.println("Pre decrement: " + num); // 20
		System.out.println("-------");
		
		// Post increment/decrement will be applied only when variable is used next time,
		// pre increment/decrement will be applied immediately.
		num = 5;
		System.out.println(num++); // 5
		System.out.println(num); // 6
		System.out.println(num); // 6
		
		System.out.println(++num); // 7
		System.out.println("---------------");
		
		num = 10;
		//  12     10 + 2
		int res = num++ + 2;
		
		System.out.println(res); // 12
		System.out.println(num); // 11
		
		int i = 5; //      5 + 3 = 8
		System.out.println(i + 3); // 8
		System.out.println(i); // 5
	}
}



