package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10992 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		 for(int i=1; i<n; i++) {
	        	System.out.printf(" ");
	        }System.out.println("*");
	        
	        for(int i=2; i<=n-1; i++) {
	        	for(int j=1; j<=n-i; j++) {
	        		System.out.printf(" ");
	        	} System.out.printf("*");
	        	for(int j=1; j<=(i-1)*2-1; j++) {
	        		System.out.printf(" ");
	        	}System.out.println("*");
	        	
	        }
	        
	        if(n!=1) {
				for(int z=1; z<2*n; z++) {
					System.out.printf("*");
				}
			}
	}

	static void drawStarsAll(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

	static void drawStarsStartAndEnd(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

}
