package day48;

public class FileCountDemo {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.name"));
		
		int count = new FileCounter().countFiles("../sdet-java-b5/src");
		System.out.println("Number of files: " + count);
		
		
		FileCounter fileCount = new FileCounter();
		int numberOfFiles = fileCount.countFiles("/Users/beknazarsuranchiyev/Desktop");
		System.out.println("Number of files in my desktop: " + numberOfFiles);
	}
}
