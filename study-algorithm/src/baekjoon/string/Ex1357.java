package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1357 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		System.out.println(rev(rev(x) + rev(y)));
		
	}
	
	static int rev(int value) {
		
		String s = String.valueOf(value);
		String chs = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			chs += s.charAt(i);
		}
		
		return Integer.parseInt(chs);
	}
}
