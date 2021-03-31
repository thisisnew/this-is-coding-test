package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2914 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		
		int answer = a * i;
		
		while(true) {
			
			int n = (int) Math.ceil((double) answer / a);
			
			if(n == i) {
				answer--;
			} else {
				break;
			}
		}
		
		System.out.println(answer+1);
		
	}
}
