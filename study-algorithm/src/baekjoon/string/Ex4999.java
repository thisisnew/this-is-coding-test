package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4999 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String jh = br.readLine();
		String dr = br.readLine();
		
		if(jh.length() < dr.length()) {
			
			System.out.println("no");
		} else {
			System.out.println("go");
		}
	}
}
