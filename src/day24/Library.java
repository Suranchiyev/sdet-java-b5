package day24;

public class Library {
	public static void main(String[] args) {
		Book oca = new Book();
		oca.title = "OCA";
		oca.pages = 500;
		oca.author = "Jeanne Boyrasky";	
		oca.read();
		
		Book ocp = new Book();
		ocp.read(); // reading null
		ocp.title = "OCP";
		ocp.read(); // reading OCP
		System.out.println("-----------");
		
		Book introToProg = new Book("Intro", 500, "Savitch");
		System.out.println(introToProg.title);
		System.out.println(introToProg.pages);
		System.out.println(introToProg.author);
		System.out.println("-----------");
		
		Book book = new Book("Algorithms", 800);
		System.out.println(book.title); // Algorithms
		System.out.println(book.pages); // 800
		
	}
}
