package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11098 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			int p = Integer.parseInt(br.readLine());
			
			int max = 0;
			String player = "";
			
			for(int j=0; j<p; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int c = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				
				if(c > max) {
					max = c;
					player = name;
				}
			}
			
			System.out.println(player);
		}
		
	}
}
