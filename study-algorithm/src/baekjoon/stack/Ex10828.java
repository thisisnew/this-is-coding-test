package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10828 {
	
	static int[] stack = new int[10000];
	static int idx = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				
				String input = st.nextToken();
				
				if(input.equals("push")) {
					push(st.nextToken());
				}
				
				if(input.equals("pop")) {
					System.out.println(pop());
				}
				
				if(input.equals("top")) {
					System.out.println(top());
				}
				
				if(input.equals("size")) {
					System.out.println(size());
				}
				
				if(input.equals("empty")) {
					System.out.println(empty());
				}
			}
		}
	}
	
	static void push(String value) {
		stack[idx] = Integer.parseInt(value);
		idx++;
	}
	
	static int pop() {
		if(idx == 0) {
			return -1;
		}
		
		int value = stack[idx-1];
		stack[idx] = 0;
		idx--;
		
		return value;
		
	}
	
	static int top() {
		if(idx == 0) {
			return -1;
		} 
		
		return stack[idx-1];
	}
	
	static int size() {
		return idx;
	}
	
	static int empty() {
		if(idx == 0) {
			return 1;
		}
		
		return 0;
	}
}
