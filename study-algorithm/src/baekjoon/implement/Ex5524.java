package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex5524 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int aCnt = 0;
		int bCnt = 0;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == b) {
				continue;
			}
			
			if(a > b) {
				aCnt++;
			}
			
			if(b > a) {
				bCnt++;
			}
		}
		
		
		System.out.println(aCnt + " " + bCnt);
		
		
		
	}
}
