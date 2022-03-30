package day48;

import java.io.File;
import java.io.IOException;

public class FilePractice2 {
	public static void main(String[] args) throws IOException {
		// absolute path is a path from the root folder of file system.
		// File jNotes1 = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b5/root/javaNotes.txt");
		// System.out.println("File exists: " + jNotes1.exists());
		
		// relative path is a path which is relative from the place where code is getting executed(located).
		// sdet-java-b5
		
		File jNotes = new File("root/javaNotes.txt");	
		System.out.println("File exists: " + jNotes.exists());
		System.out.println("File size ib bytes: " + jNotes.length());
		System.out.println("is file: " + jNotes.isFile());
		System.out.println("Absolute path: " + jNotes.getAbsolutePath());
		
		// File class can also represent directories(foloders)
		
		File rootDir = new File("root");
		System.out.println("Is folder: " + rootDir.isDirectory());
		
		File tmpDir = new File("root/sdet");
		
		if (!tmpDir.exists()) {
			// make directory
			tmpDir.mkdir();
		}
		
		File f1 = new File("root/sdet/oop.pdf");
		boolean isCreated = f1.createNewFile();
		System.out.println("Is file created: " + isCreated);
		
		File f2 = new File(tmpDir.getAbsolutePath() + "/slides");
		f2.createNewFile();
		
		File f3 = new File(tmpDir.getAbsolutePath() + "/cat.png");
		f3.createNewFile();
		
		File f4 = new File(tmpDir.getAbsolutePath() + "/testCases.xlsx");
		f4.createNewFile();
	}
}




