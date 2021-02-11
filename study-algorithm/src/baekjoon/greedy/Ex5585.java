package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int diff = 1000 - num;
		int[] remains = {500, 100, 50, 10, 5, 1};
	
		int answer = 0;
		for(int remain : remains) {
			int div = diff / remain;
			if(div > 0) {
				answer += div;
				diff %= remain;
			}
		}
		
		System.out.println(answer);
	}
}
