package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14916 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		
		while(num>0) {
			if(num % 5 == 0) {
				answer += num/5;
				break;
			} 
			
			num -= 2;
			answer++;
		}
		
		if(num<0) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}	
}
