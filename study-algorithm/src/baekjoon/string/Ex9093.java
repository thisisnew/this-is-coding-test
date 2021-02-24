package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringBuffer sb = new StringBuffer();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int tokens = st.countTokens();
			int cnt = 0;
			
			while(st.hasMoreTokens()) {
				cnt++;
				String str = st.nextToken();
				
				for(int j=str.length()-1; j>=0; j--) {
					sb.append(str.charAt(j));
				}
				
				if(cnt != tokens) {
					sb.append(" ");
				}
			}
			
			System.out.println(sb.toString());
		}
		
	}
}
