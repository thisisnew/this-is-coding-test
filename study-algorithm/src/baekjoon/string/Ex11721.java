package baekjoon.string;

import java.util.Scanner;

public class Ex11721 {
	public static void main(String[] args) {
		String words = "";
		Scanner scanner = new Scanner(System.in);
		words = scanner.nextLine();
		
		if(words.length() <= 10) {
			System.out.println(words);
		} else {
			for(int i=0; i<= words.length()/10; i++) {
				if(i == words.length()/10) {
					System.out.println(words.substring(i*10, words.length()));
				} else {
					System.out.println(words.substring(i*10, i*10+10));
				}
			}
		}
	}
}
