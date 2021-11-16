package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15312 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();
		String B = br.readLine();

		String sumName = "";
		for (int i = 0; i < A.length(); i++) {
			sumName += A.charAt(i);
			sumName += B.charAt(i);
		}

		int[] arr = new int[sumName.length()];
		for (int i = 0; i < sumName.length(); i++) {
			arr[i] = getNumber(sumName.charAt(i));
		}

		while (true) {
			if (arr.length == 2) {
				int result = arr[0] + arr[1];
				System.out.println(sum(result));
				break;
			} else {
				int[] newArr = new int[arr.length - 1];

				for (int i = 0; i < arr.length; i++) {
					if(i == arr.length-1) {
						break;
					}
					
					newArr[i] = sumNumber(arr[i], arr[i+1]);
				}

				arr = newArr;
			}

		}

	}
	
	private static int sumNumber(int i, int j) {
		return i+j;
	}
	
	private static int getNumber(char c) {
		int result = 0;

		switch (c) {
		case 'A': {
			result = 3;
			break;
		}
		case 'B': {
			result = 2;
			break;
		}
		case 'C': {
			result = 1;
			break;
		}
		case 'D': {
			result = 2;
			break;
		}
		case 'E': {
			result = 3;
			break;
		}
		case 'F': {
			result = 3;
			break;
		}
		case 'G': {
			result = 2;
			break;
		}
		case 'H': {
			result = 3;
			break;
		}
		case 'I': {
			result = 3;
			break;
		}
		case 'J': {
			result = 2;
			break;
		}
		case 'K': {
			result = 2;
			break;
		}
		case 'L': {
			result = 1;
			break;
		}
		case 'M': {
			result = 2;
			break;
		}
		case 'N': {
			result = 2;
			break;
		}
		case 'O': {
			result = 1;
			break;
		}
		case 'P': {
			result = 2;
			break;
		}
		case 'Q': {
			result = 2;
			break;
		}
		case 'R': {
			result = 2;
			break;
		}
		case 'S': {
			result = 1;
			break;
		}
		case 'T': {
			result = 2;
			break;
		}
		case 'U': {
			result = 1;
			break;
		}
		case 'V': {
			result = 1;
			break;
		}
		case 'W': {
			result = 1;
			break;
		}
		case 'X': {
			result = 2;
			break;
		}
		case 'Y': {
			result = 2;
			break;
		}
		case 'Z': {
			result = 1;
			break;
		}
		}

		return result;
	}

	private static int sum(int result) {
		if (result > 99) {
			result = result % 10;
			sum(result);
		}
		return result;
	}
}
