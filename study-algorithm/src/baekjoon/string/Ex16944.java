package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex16944 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int result = 0;
		
		if (!isMoreThenSixLetters(number)){
			result++;
		}
		if (!hasCapitalAlphabet(input)){
			result++;
		}
		if (!hasSmallAlphabet(input)){
			result++;
		}
		if (!hasSpecialCharacters(input)){
			result++;
		}
	
		System.out.println(result);
		
	}
	
	private static boolean isMoreThenSixLetters(int length) {
		if(length < 6) {
			return false;
		}
		
		return true;
	}
	
	private static boolean hasCapitalAlphabet(String value) {
		for(int i=0; i<value.length(); i++) {
			char c = value.charAt(i);
			
			if(!Character.isUpperCase(c)) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean hasSmallAlphabet(String value) {
		for(int i=0; i<value.length(); i++) {
			char c = value.charAt(i);
			
			if(!Character.isLowerCase(c)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean hasSpecialCharacters(String value) {
		return true;
	}
	
}
