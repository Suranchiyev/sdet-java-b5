package day10;

public class Greater {
	public static void main(String[] args) {
		System.out.println(greater100(199.5));
		
		double res = greater100(50.9);
		System.out.println(res); // 100.0
	}
	
	public static double greater100(double dNum) {
		if (dNum > 100) {
			return dNum;
		} else {
			return 100.0;
		}
	}
}
