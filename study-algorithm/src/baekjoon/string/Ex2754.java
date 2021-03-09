package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2754 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		System.out.println(calc(input));
	}
	
	static double calc(String score) {
		
		double point = 0.0;
		
		switch (score) {
			case "A+": point = 4.3; break;
			case "A0": point = 4.0; break;
			case "A-": point = 3.7; break;
			case "B+": point = 3.3; break;
			case "B0": point = 3.0; break;
			case "B-": point = 2.7; break;
			case "C+": point = 2.3; break;
			case "C0": point = 2.0; break;
			case "C-": point = 1.7; break;
			case "D+": point = 1.3; break;
			case "D0": point = 1.0; break;
			case "D-": point = 0.7; break;
		}
		
		return point;
	}
}
