package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18238 {
	
	static final int A = (int)'A'-64;
	static final int Z = (int)'Z'-64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();

		System.out.println(caculate(input));
	}

	private static int caculate(String input) {
		int total = 0;
		
		for(int i=0; i<input.length(); i++) { 
			
			int from = A;
			
			if(i > 0) {
				from = input.charAt(i-1) - 64;
			}
			
			int to = (int)input.charAt(i) - 64;
			
			int leftCount = left(from, to);
			int rightCount = right(from, to);
			
			if(leftCount < rightCount) {
				total += leftCount;
			} else {
				total += rightCount;
			}
			
		}
		
		return total;
	}
	
	private static int left(int from, int to) {
		int count = 0;
		
		int pin = from;
		
		while(true) {
			
			if(pin == to) {
				break;
			}
			
			pin--;
			count++;
			
			if(pin < A) {
				pin = Z;
			}
			
		}
		
		return count;
	}
	
	private static int right(int from, int to) {
		int count = 0;
		
		int pin = from;
		
		while(true) {
			
			if(pin == to) {
				break;
			}
			
			pin++;
			count++;
			
			if(pin > Z) {
				pin = A;
			}
			
		}
		
		return count;	
	}
}
