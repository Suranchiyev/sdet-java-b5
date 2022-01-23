package day12;

public class MoneyExchange {
	public static final double RUBLE_EXCHANGE_RATE = 0.014;
	
	public static double exchangeRuble(final int rubles) {
		return rubles * RUBLE_EXCHANGE_RATE;
	}
	
	public static void main(String[] args) {
		int ruble = 150;
		ruble = 250;
		System.out.println(exchangeRuble(ruble));
		
	    final String name = "John Doe";
		// name = "Will Smith"; we cannot change the original value.
		
		// Constants:
		// 1. static final making the variables as a constant.
		// 2. It's common approach to name constants with all upper cases.
		// 3. We cannot change value of constants after it's being assigned.
		
		// final keyword
		// when we tag our variables with final, we cannot reassign new value.
		// 1. we can tag our local variables as final.
		// 2. we can tag our method arguments as final.
		// 3. class level(static, instance) variables also can be final.
	}
}
