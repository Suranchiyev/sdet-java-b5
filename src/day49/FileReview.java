package day49;

import java.io.File;

public class FileReview {
	public static void main(String[] args) {
		// File path:
		// - absolute file path is a path from the root directory of file system
		// - relative file path is a path from the place where code is getting executed
		
		// File class represents directories and files in java
		// - it has many useful methods to get information about the file
		// - it can create/delete files and directories
		
		File file = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b5/root/javaNotes.txt");
		System.out.println(file.exists());
		
		File file2 = new File("root/javaNotes.txt");
		System.out.println(file2.exists());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.length());
		
		File file3 = new File("root/oopNotes.txt");
		try {
			if (!file3.exists()) {
				file3.createNewFile();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		boolean isDeleted = file3.delete();
		System.out.println("is deleted: " + isDeleted);
	}
}
