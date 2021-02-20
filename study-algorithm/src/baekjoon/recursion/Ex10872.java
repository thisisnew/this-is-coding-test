package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum = factorial(n);
		
		System.out.println(sum);
	}
	
	static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		return n* factorial(n-1);
		
	}
}
