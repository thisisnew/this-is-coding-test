package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int[] array = new int[input];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			
			if(a == 0) {
				sum = 0;
			}
			
			sum += a;
			
			array[i] = sum;
		}
		
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			answer += array[i];
		}
		
		System.out.println(answer);
	}
}
