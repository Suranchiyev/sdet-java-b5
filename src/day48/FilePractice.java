package day48;

import java.io.File;

public class FilePractice {
	public static void main(String[] args) {
		// File class represents files and folders in our machine.
		// We can get information about the file/folder but we cannot read
		// and write content into the file.
		// We can create or delete files/directories using this class.
		File myFile = new File("/Users/beknazarsuranchiyev/Desktop/notes.txt");
		
		System.out.println("File exists: "+ myFile.exists());
		System.out.println("File name: " + myFile.getName());
		System.out.println("Path: " + myFile.getAbsolutePath());
		
		// File class represents files and folders in our machine.
		System.out.println("Is file: " + myFile.isFile());
		System.out.println("Is directory: " + myFile.isDirectory());
		
		System.out.println("Size in bytes: " + myFile.length());
		
		// it will return date in epoch format 
		// epoch is number of seconds from 00:00 Jan 1, 1970
		System.out.println("Last modified: " + myFile.lastModified());
		
		// rename
		myFile.renameTo(new File("/Users/beknazarsuranchiyev/Desktop/notes_2.txt"));
	}
}
