package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5363 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String header = "";
			String body = "";
			
			int cnt = 1;
			
			while(st.hasMoreTokens()) {
				
				if(cnt < 3) {
					header += st.nextToken() + " ";
				} else {
					body += st.nextToken() + " ";
				}
				
				cnt++;
			}
			
			String answer = body + header;
			
			System.out.println(answer.trim());
		}
		
	}
}
