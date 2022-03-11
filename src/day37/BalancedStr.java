package day37;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		System.out.println(isBalanced("[{()}]")); // true
		System.out.println(isBalanced("[({(})]")); // false
		System.out.println(isBalanced("{[}")); // false
		System.out.println(isBalanced("({}{}([{}]))")); // true
		System.out.println(isBalanced("({")); // false
		System.out.println(isBalanced("({})[]")); // true
		System.out.println(isBalanced("]]")); // false
	}
	
	/*
	 * String str will consist of [, ], {, }, (, ) brackets
	 * String is balanced if for every type of open bracket there is 
	 * correct closed one.
	 * 
	 * isBalanced("[{()}]") - true
     * isBalanced("[({(})]") - false
     * isBalanced("{[}") - false
     * isBalanced("({}{}([{}]))") - true
     * isBalanced("({") - false
	 */
	public static boolean isBalanced(String str) {
		// we will use stack to monitor open brackets
		Stack<Character> stack = new Stack<>();
		
		for (char ch : str.toCharArray()) {
			// if brackets are open put into the stack
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
				
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				
				// get latest open bracket
				char latestOpenB = stack.pop();
				
				// check if latest open and current closed are matching
				if (ch == ']' && latestOpenB != '[') {
					return false;
				} else if (ch == ')' && latestOpenB != '(') {
					return false;
				} else if (ch == '}' && latestOpenB != '{') {
					return false;
				}
			}
		}
		
		// if stack is not empty then it has open bracket without closed once so it is not balanced
		return stack.isEmpty();
	}
}






