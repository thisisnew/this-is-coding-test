package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10828 {
	
	static int[] stack;
	static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		stack = new int[n];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String direction = st.nextToken();
			
			if(direction.equals("push")) {
				int val = Integer.parseInt(st.nextToken());
				
				push(val);
			}
			
			if(direction.equals("pop")) {
				sb.append(pop()).append("\n");
			}
			
			if(direction.equals("size")) {
				sb.append(size()).append("\n");
			}
			
			if(direction.equals("empty")) {
				sb.append(empty()).append("\n");
			}
			
			if(direction.equals("top")) {
				sb.append(top()).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
	
	static void push(int value) {
		stack[size] = value;
		size++;
	}
	
	static int pop() {
		if(size == 0) {
			return -1;
		} else {
			int r = stack[size-1];
			stack[size-1] = 0;
			size--;
			return r;
		}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	static int top() {
		if(size == 0) {
			return -1;
		} else {
			return stack[size-1];
		}
	}
}
