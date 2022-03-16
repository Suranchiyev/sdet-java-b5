package day40;

public class SuperheroDemo {
	public static void main(String[] args) {
		Superhero hero1 = new Superhero();
		hero1.name = "Alex";
		hero1.powerLevel = 6;
		
		Superhero hero2 = new Superhero("Kuba");
		System.out.println(hero2.name); // 
		System.out.println(hero2.powerLevel); //
		
		Superhero hero3 = new Superhero("John", 3);
		System.out.println(hero3.name + ", " + hero3.powerLevel);
		
		System.out.println("-------");
		Superhero hero4 = new Superhero("Superman");
	}
}
