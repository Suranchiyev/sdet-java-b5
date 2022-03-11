package day37;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		// Stack is LIFO data structure.
		// Last In, First Out
		// push(); will add new element to the stack
		// pop(); will get and remove element from the stack based LIFO order
		
		Stack<String> emails = new Stack<>();
		emails.push("Email from: John");
		emails.push("Email from: Alex");
		emails.push("Email from: Florencia");
		
		emails.push("Email from: Smith");
		
		System.out.println(emails);
		
		String emailOnTop = emails.pop();
		System.out.println("Reading this email - " + emailOnTop);
		System.out.println(emails);
		
		emailOnTop = emails.pop();
		System.out.println("Reading this email - " + emailOnTop);
		System.out.println(emails);
		
		while (!emails.isEmpty()) {
			System.out.println("----");
			emailOnTop = emails.pop();
			System.out.println("Reading this email - " + emailOnTop);
		}
	}
}
