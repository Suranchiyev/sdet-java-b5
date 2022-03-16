package day39;

import day40.Student;

public class StudentDemo2 {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "John Doe";
		// it doesn't compile, course is protected
		// obj.course = "Java";
		
		// it doesn't compile, grade is default
		// obj.grade = 100.0;
	}
}
