package day47;

public class PersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		
		// TODO
		// handle this exception here
		// and print exception is handled
		try {
			person.setAge(-2);
			
		} catch(RuntimeException e) {
			System.out.println("Exception is handled");
		}
		
		// BREAK TILL 11:21AM EST
	}
}
