package day48;

import java.io.File;

public class FileCounter {
	private int count;
	
	public int countFiles(String path) {	
		File dir = new File(path);
		
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			if (files != null) {
				
				for (File file: files) {
					if (file.isFile()) {
						count++;
					} else {
						countFiles(file.getAbsolutePath());
					}
				}
			}
		}
		
		return count;
	}
}
