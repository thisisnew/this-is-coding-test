package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			
			int small = 0;
			int capital = 0;
			int space = 0;
			int numeric = 0;
			
			for(int i=0; i<input.length(); i++) {
				
				char c = input.charAt(i);
				
                if (c >= 'a' && c <= 'z') {
                    small++;
                }

                if (c >= 'A' && c <= 'Z') {
                    capital++;
                }

                if (c >= '0' && c <= '9') {
                    numeric++;
                }
          
                if (c == ' ') {
                    space++;
                }
				
			}
			
			System.out.println(small + " " + capital + " " + numeric + " " + space);
			
			
			input = br.readLine();
			
			if(input == null || input.equals("")) {
				break;
			}
		}
		
	}
}
