package day43;

public class Parent {
	
	public void walk() {
		System.out.println("Prent class is walking");
	}
	
	public String getWords() {
		return "Words from Parent class";
	}
	
	public Parent() {}
	
	public Parent(String str) {
		System.out.println("str: " + str);
	}
}
