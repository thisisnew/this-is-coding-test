package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex15814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		char[] array = new char[s.length()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = s.charAt(i);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			char temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : array) {
			sb.append(c);
		}
		
		System.out.println(sb);
	}
}
