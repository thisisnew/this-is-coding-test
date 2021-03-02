package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex18258 {
	
	static int[] queue = new int[2000000];
	static int size = 0;
	static int front = 0;
	static int back = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String input = st.nextToken();
			
			if(input.equals("push")) {
				push(Integer.parseInt(st.nextToken()));
			}
			
			if(input.equals("pop")) {
				pop();
			}
			
			if(input.equals("size")) {
				size();
			}
			
			if(input.equals("empty")) {
				empty();
			}
			
			if(input.equals("front")) {
				front();
			}
			
			if(input.equals("back")) {
				back();
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
	static void push(int x) {
		queue[back] = x;
		back++;
		size++;
	}
	
	static void pop() {
		if(size == 0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(queue[front]).append("\n");
			size--;
			front++;
		}
	}
	
	static void size() {
		sb.append(size).append("\n");
	}
	
	static void empty() {
		if(size == 0) {
			sb.append(1).append("\n");
		} else {
			sb.append(0).append("\n");
		}
	}
	
	static void front() {
		if(size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[front]).append("\n");
		}
	}
	
	static void back() {
		if(size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[back-1]).append("\n");
		}
	}
}
