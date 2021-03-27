package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9295 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			System.out.println("Case " + i + ": " + sum);
			
		}
	}
}
