package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] array = new String[n];
		int hCnt = 0;
		int vCnt = 0;
		StringTokenizer st;
		
		for(int i=0; i<array.length; i++) {
			String input = br.readLine();
			array[i] = input;
			
			st = new StringTokenizer(input, "X");
			while(st.hasMoreTokens()) {
				if(st.nextToken().length() > 1) {
					hCnt++;
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {			
			String temp = "";
			for(int j=0; j<array.length; j++) {
				temp += array[j].charAt(i);
			}
			st = new StringTokenizer(temp, "X");
			while(st.hasMoreTokens()) {
				if(st.nextToken().length() > 1) {
					vCnt++;
				}
			}
		}
		
		System.out.println(hCnt + " " + vCnt);
		
	}
}
