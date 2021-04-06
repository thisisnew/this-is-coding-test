package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex14909 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n > 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
