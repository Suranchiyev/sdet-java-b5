package day49;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesStream {
	public static void main(String[] args) {
		// InputStreams - for reading data
		// OutputStreams - for writing data
		
		// FileOutputStream will create a file if it doesn't exist.
		
		try (OutputStream output = new FileOutputStream("root/test.txt")) {
			
			output.write(72); // 72 - H
			output.write(73); // 73 - I
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
