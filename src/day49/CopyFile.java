package day49;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	// Streams can be used with any data types
	// Readers/Writers good to work with text files
	public static void main(String[] args) {
		System.out.println("copy is started");	
		// copy("root/switch_1.mp4", "root/switch_copy.mp4");
		copy2("root/switch_1.mp4", "root/switch_copy_buffered.mp4");
		System.out.println("copy is completed");
	}
	
	public static void copy(String sourcePath, String targetPath) {
		try (InputStream input = new FileInputStream(sourcePath);
			 OutputStream output = new FileOutputStream(targetPath)) {
			
			byte[] buffer = new byte[1024];
			int b;
			while ((b = input.read(buffer)) != -1) {
				output.write(buffer, 0, b);
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copy2(String s, String t) {
		try (BufferedInputStream bInput = new BufferedInputStream(new FileInputStream(s));
			 BufferedOutputStream bOutput = new BufferedOutputStream(new FileOutputStream(t))) {
			
			int b;
			while ((b = bInput.read()) != -1) {
				bOutput.write(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
