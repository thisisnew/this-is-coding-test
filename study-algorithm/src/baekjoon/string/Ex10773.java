package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int answer = 0;
		
		for(int i=0; i<k; i++) {
			
			String input = br.readLine();
			
			if(input.equals("0")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(input));
			}
		}
		
		for(int i : stack) {
			answer += i;
		}
		
		System.out.println(answer);
		
	}
}
