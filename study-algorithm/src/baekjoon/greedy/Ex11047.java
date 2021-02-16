package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11047 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		
		for(int i=0; i<coins.length; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		
		for(int i=coins.length-1; i>=0; i--) {
			if(k / coins[i] > 0) {
				answer += k / coins[i]; 
				k = k % coins[i];
			}
		}
		
		System.out.println(answer);
	}
}
