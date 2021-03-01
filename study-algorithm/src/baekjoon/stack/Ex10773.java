package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10773 {
	
	static int[] stack;
	static int size;
	static int sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		stack = new int[k];
		
		for(int i=0; i<k; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				pop();
			} else {
				push(input);
			}
		}
		
		for(int i : stack) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	static void push(int input) {
		stack[size] = input;
		size++;
	}
	
	static void pop() {
		size--;
		stack[size] = 0;
	}
}
