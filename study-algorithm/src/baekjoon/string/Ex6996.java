package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex6996 {
	
	static String sort(String value) {
		char[] cArr = value.toCharArray();
		Arrays.sort(cArr);
		return new String(cArr);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] array = new String[n];
		StringTokenizer st;
		
		for(int i=0; i<array.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			String t = st.nextToken();
			String answer = s + " & " + t + " are ";

			if(!sort(s).equals(sort(t))) {
				answer += "NOT ";
			}
			
			answer += "anagrams.";
			array[i] = answer;
		}
		
		for(String s : array) {
			System.out.println(s);
		}
	}
}
