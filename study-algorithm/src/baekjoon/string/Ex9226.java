package baekjoon.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9226 {

	public static boolean isVowel(char c) {
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == c) return true;
		}
		return false;
	}
	
	public static String convertToPigLatin(String message) {
		StringBuilder sb = new StringBuilder(message);
		
		boolean foundVowel = false;
		int index = 0;
		for(; index < sb.length(); index++) {
			if(isVowel(sb.charAt(index))) {
				foundVowel = true;
				break;
			}
		}
		
		if(foundVowel) {
			if(index != 0) {
				String s = sb.substring(0, index);
				sb.delete(0,  index);
				sb.append(s);
			}
		}

		sb.append("ay");
		return sb.toString();
	}
	
	private static List<String> words;
	
	private static boolean input() {
		boolean state;
		
		try(Scanner kb = new Scanner(System.in)) {
			words = new ArrayList<>();
			do {
				String t;
				t = kb.next();
				if(t.equals("#")) break;
				words.add(t);
			} while(true);
			state = true;
		}
		catch(Exception e) {
			state = false;
		}
		
		return state;
	}
	
	private static void printAnswer() {
		for(var s : words) {
			System.out.println(convertToPigLatin(s));
		}
	}

	public static void main(String[] args) {
		
		if(input()) {
			printAnswer();
		}
	}
}
