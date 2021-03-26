package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] students = new boolean[31];
		students[0] = true;
		
		for(int i=0; i<28; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			students[n] = true;
		}
		
		for(int i=0; i<students.length; i++) {
			
			if(!students[i]) {
				System.out.println(i);
			}
			
		}
		
	}
}
