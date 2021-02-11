package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String answer = "";
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String value = String.valueOf(n);
		
		for(int i=0; i<n; i++) {
			answer += value;
		}
		
		if(answer.length() > m) {
			answer = answer.substring(0, m);
		}
		
		System.out.println(answer);
		
	}
}
