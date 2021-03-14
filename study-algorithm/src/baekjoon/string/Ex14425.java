package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] s = new String[n];
		
		for(int i=0; i<s.length; i++) {
			s[i] = br.readLine();
		}
		
		int answer = 0;
		
		for(int i=0; i<m; i++) {
			
			String input = br.readLine();
			
			if(Arrays.asList(s).indexOf(input) > -1) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
