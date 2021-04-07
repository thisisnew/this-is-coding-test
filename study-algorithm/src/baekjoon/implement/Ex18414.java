package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex18414 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int answer = 0;
		
		for(int i=l; i<=r; i++) {
			int dif = Math.abs(x-i);
			
			if(dif < min) {
				min = dif;
				answer = i;
			}
		}
		
		System.out.println(answer);
	}
}
