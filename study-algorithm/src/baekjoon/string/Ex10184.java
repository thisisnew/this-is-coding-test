package baekjoon.string;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Ex10184 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

		for (int i = 65; i <= 90; i++) {
			char c = (char) i;

			System.out.print(c + " | ");

			switch (c) {
			case 'A': {
				System.out.println("*******");
				break;
			}
			case 'B': {
				System.out.println();
				break;
			}
			case 'C': {
				System.out.println("***");
				break;
			}
			case 'D': {
				System.out.println("*");
				break;
			}
			case 'E': {
				System.out.println("************");
				break;
			}
			case 'F': {
				System.out.println("***");
				break;
			}
			case 'G': {
				System.out.println("***");
				break;
			}
			case 'H': {
				System.out.println("****");
				break;
			}
			case 'I': {
				System.out.println("*****");
				break;
			}
			case 'J': {
				System.out.println("");
				break;
			}
			case 'K': {
				System.out.println("");
				break;
			}
			case 'L': {
				System.out.println("****");
				break;
			}
			case 'M': {
				System.out.println("***");
				break;
			}
			case 'N': {
				System.out.println("*****");
				break;
			}
			case 'O': {
				System.out.println("*******");
				break;
			}
			case 'P': {
				System.out.println("*****");
				break;
			}
			case 'Q': {
				System.out.println("*");
				break;
			}
			case 'R': {
				System.out.println("******");
				break;
			}
			case 'S': {
				System.out.println("******");
				break;
			}
			case 'T': {
				System.out.println("***********");
				break;
			}
			case 'U': {
				System.out.println("*");
				break;
			}
			case 'V': {
				System.out.println("");
				break;
			}
			case 'W': {
				System.out.println("**");
				break;
			}
			case 'X': {
				System.out.println("*");
				break;
			}
			case 'Y': {
				System.out.println("*");
				break;
			}
			case 'Z': {
				System.out.println("*");
				break;
			}
			}

		}
	}
}
