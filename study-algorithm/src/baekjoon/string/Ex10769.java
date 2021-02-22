package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int smile = 0;
		int sad = 0;
		int check = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ':' || (input.charAt(i) == '-' && check == 1)) {
				check++;
				continue;
			} else if(check == 2) {
				if(input.charAt(i) == ')') {
					smile++;
				} else if(input.charAt(i) == '(') {
					sad++;
				}
			}
			
			check = 0;
		}
	
	
		
	if(smile == 0 && sad == 0) {
		System.out.println("none");
	}else {
		if(smile>sad) {
			System.out.println("happy");
		}else if(sad>smile)	{
			System.out.println("sad");
		} else {
			System.out.println("unsure");
		}
	}
	}
}
