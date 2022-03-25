package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15239 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int len = Integer.parseInt(br.readLine());
			String pass = br.readLine();
		}
		
	}
	
	private static boolean isValidLength(int len) {
		
		if(len >= 12) {
			return true;
		}
		
		return false;
	}
}
