package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex17413 {
	
	static List<Character> list = new ArrayList<Character>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		boolean isBracket = false;
		
		String sum = "";
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
				
			if(c == '<') {
				sum += getReverseString();
				isBracket = true;
			}
			
			if(isBracket) {
				sum += c;
			} else {
				
				if(c == ' ') {
					sum += getReverseString();
					sum += " ";
				} else {
					list.add(c);
				}
				
			}
			
			if(c == '>') {
				isBracket = false;
			}
			
		}
		
		sum += getReverseString();
		System.out.println(sum);
	}
	
	static String getReverseString() {
		
		if(list.size() == 0) {
			return "";
		}
		
		String value = "";
		
		for(int i=list.size()-1; i>=0; i--) {
			value += list.get(i);
		}
		
		list.clear();
		
		return value;
	}
}