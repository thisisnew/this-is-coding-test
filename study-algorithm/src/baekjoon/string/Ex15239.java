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
			
			if(!isValidLength(len)) {
				System.out.println("invalid");
				continue;
			}
			
			if(!hasMoreThenOneDigit(pass)) {
				System.out.println("invalid");
				continue;
			}
			
			if(!hasMoreThenOneUpperCase(pass)) {
				System.out.println("invalid");
				continue;
			}
			
			if(!hasMoreThenOneLowerCase(pass)) {
				System.out.println("invalid");
				continue;
			}
			
			if(!hasMoreThenOneSymbol(pass)) {
				System.out.println("invalid");
				continue;
			}
			
			System.out.println("valid");
		}
		
	}
	
	private static boolean isValidLength(int len) {
		
		if(len >= 12) {
			return true;
		}
		
		return false;
	}
	
	private static boolean hasMoreThenOneDigit(String pass) {
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean hasMoreThenOneUpperCase(String pass) {
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean hasMoreThenOneLowerCase(String pass) {
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean hasMoreThenOneSymbol(String pass) {
		
		for(int i=0; i<pass.length(); i++) {
			if("+_)(*&^%$#@!./,;{}".contains(String.valueOf(pass.charAt(i)))) {
				return true;
			}
		}
		
		return false;
	}
}
