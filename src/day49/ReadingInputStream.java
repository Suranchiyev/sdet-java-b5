package day49;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingInputStream {
	public static void main(String[] args) {
		File file = new File("root/notes.txt");
		InputStream in = null;

		try {
			in = new FileInputStream(file);
			int b;

			while ((b = in.read()) != -1) {
				System.out.print((char)b); 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
