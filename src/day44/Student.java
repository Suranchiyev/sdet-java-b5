package day44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable {
	public String name;
	public int age;
	public String course;
	
	public Student() {}
	
	public Student(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
//		if (age > s.age) {
//			return -1;
//		} else if (age < s.age) {
//			return 1;
//		}
		
//		return 0;
		
		return name.compareTo(s.name);
	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("John Doe", 27, "Java"));
		list.add(new Student("Alex Rodriguez", 37, "SDLC"));
		list.add(new Student("Munavvar", 25, "Java"));
		list.add(new Student("Ramesh", 38, "Selenium"));
		list.add(new Student("Kuba", 38, "JMeter"));
		
		System.out.println(list);
		// List<Integer> lNum = Arrays.asList(1, 3, 5, 9, 0);
		Collections.sort(list);
		System.out.println(list);
	}
}
