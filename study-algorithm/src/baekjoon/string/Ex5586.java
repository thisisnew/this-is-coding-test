package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5586 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String joi = input;
		String ioi = input;

		joi = joi.replace("JOI", "");
		ioi = ioi.replace("IOI", "");
		
		System.out.println((input.length()-joi.length())/3);
		System.out.println((input.length()-ioi.length())/3);
		
	}
}
