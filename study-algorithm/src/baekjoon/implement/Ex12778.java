package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex12778 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			String type = st.nextToken();
			
			st = new StringTokenizer(br.readLine());
			
			if(type.equals("C")) {
				for(int j=0; j<n; j++) {
					char c = st.nextToken().charAt(0);
					
					System.out.print(((int)c-64) + " ");
				}
			}
			
			if(type.equals("N")) {
				for(int j=0; j<n; j++) {
					int v = Integer.parseInt(st.nextToken());
					
					System.out.print((char)(v+64) + " ");
				}
			}
			
			System.out.println();
		}
		
	}
}
