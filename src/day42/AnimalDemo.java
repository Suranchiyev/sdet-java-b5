package day42;

public class AnimalDemo {
	public static void main(String[] args) {
		Lion obj = new Lion();
		obj.name = "Alex";
		obj.age = 5;
		obj.str = "string value";
		obj.eat();
		obj.run();
		System.out.println(obj.getName());
	}
}
