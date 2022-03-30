package day47;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	// TODO
	// if name is empty or null throw IllegalArgumentException
	// throw new ExcpetionName();
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("cannot be null or empty");
		}
		
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	// TODO
	// if age in negative throw IlllegalArgumentException
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("cannot be negative age");
		}
		
		this.age = age;
	}
}
