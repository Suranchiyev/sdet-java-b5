package day49;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
	public static void main(String[] args) {
		// Reading the file with file writer
		try (BufferedReader bReader = new BufferedReader(new FileReader("root/notes.txt"))) {
			String line;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------");
		
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("root/writerFile.txt"))) {
			
			bWriter.write("Hello, World!");
			bWriter.newLine();
			bWriter.write("Java is object-oriented programming language");
			bWriter.newLine();
			bWriter.write("There are 4 concepts of OOP in java.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> readContent(String path) {
		List<String> content = new ArrayList<>();
		try (BufferedReader bR = new BufferedReader(new FileReader(path))) {
			
			String line;
			while ((line = bR.readLine()) != null) {
				content.add(line);
			}
			
			return content;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void writeContent(List<String> content, String path) {
		try (BufferedWriter bW = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : content) {
				bW.write(line);
				bW.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
}
