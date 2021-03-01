package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex4949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String input = br.readLine();
			
			if(input.equals(".")) {
				break;
			}
			
			Stack<Character> stack = new Stack<Character>();
			String result = "yes";
			
			for(int i=0; i<input.length(); i++) {
				char c = input.charAt(i);
				
				if(c == '(') {
					stack.push(c);
				}
				
				if(c == ')') {
					if(stack.isEmpty() || stack.peek() != '(') {
						result = "no";
						break;
					}
					
					stack.pop();
				}
				
				if(c == '[') {
					stack.push(c);
				}
				
				if(c == ']') {
					if(stack.isEmpty() || stack.peek() != '[') {
						result = "no";
						break;
					}
					
					stack.pop();
				}
			}
			
			if(!stack.isEmpty()) {
				result = "no";
			}
			
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
