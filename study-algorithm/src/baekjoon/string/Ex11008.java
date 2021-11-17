package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11008 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			String p = st.nextToken();
			int cnt = 0;
			
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i) == p.charAt(0)) {
					
				}
			}
			
			System.out.println(cnt+ s.length());
		}

	}
}
