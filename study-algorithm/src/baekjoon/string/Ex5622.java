package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex5622 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			sum += getNumber(input.charAt(i));
		}
		
		System.out.println(sum);
	}

	static int getNumber(char c) {

		int value = 0;

		switch (c) {
		case 'A':
		case 'B':
		case 'C': {
			value = 3;
			break;
		}
		case 'D':
		case 'E':
		case 'F': {
			value = 4;
			break;
		}
		case 'G':
		case 'H':
		case 'I': {
			value = 5;
			break;
		}
		case 'J':
		case 'K':
		case 'L': {
			value = 6;
			break;
		}
		case 'M':
		case 'N':
		case 'O': {
			value = 7;
			break;
		}
		case 'P':
		case 'Q':
		case 'R':
		case 'S': {
			value = 8;
			break;
		}
		case 'T':
		case 'U':
		case 'V': {
			value = 9;
			break;
		}
		case 'W':
		case 'X':
		case 'Y':
		case 'Z': {
			value =  10;
			break;
		}
		}
		return value;
	}
}
