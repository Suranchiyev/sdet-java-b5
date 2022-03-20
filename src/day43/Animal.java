package day43;

public abstract class Animal {
	public String name;
	
	public void printName() {
		System.out.println(name);
	}
	
	public abstract void eat();
	public abstract void drink();
}
