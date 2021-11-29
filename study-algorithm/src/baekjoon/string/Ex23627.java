package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex23627 {
	
	final static String DRIIP = "driip";
	
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String driip = "";
		boolean isValid = false;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c == 'd') {
				driip += c;
				isValid = isValid(driip);
			} else {
				if(isValid) {
					driip += c;
					isValid = isValid(driip);
				} else {
					driip = "";
				}
			}
		}
		
		if(isValid) {
			System.out.println("cute");
		} else {
			System.out.println("not cute");
		}
	}
	
	private static boolean isValid(String value) {
		
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i) != DRIIP.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
}
