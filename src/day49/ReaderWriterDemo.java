package day49;

import java.util.ArrayList;
import java.util.List;

public class ReaderWriterDemo {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("John");
//		list.add("Ramesh");
//		list.add("Vijay");
//		list.add("Milena");
//		list.add("Tomas");
//		list.add("Sunil");
		
		// ReaderAndWriter.writeContent(list, "root/listOfNames.txt");
		
		List<String> content = ReaderAndWriter.readContent("root/listOfNames.txt");
		System.out.println(content);
	}
}
