package day43;

public class D extends C {	
	@Override
	public void m1() {
		System.out.println("Hello!");
	}
	
	@Override
	public String m2() {
		return "apple";
	}
	
	@Override
	public int m3() {
		return 7;
	}
	
	public static void main(String[] args) {
		// C obj = new C();
		D obj = new D();
		obj.m1();
		obj.name = "Alex";
		obj.num = 99;
		
		
	}
}
