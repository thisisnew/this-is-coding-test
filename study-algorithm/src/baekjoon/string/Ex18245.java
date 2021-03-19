package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18245 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int cnt = 1;
		
		while(true) {
			
			String answer = "";
			int temp = 0;
			
			for(int i=0; i<input.length(); i++) {
				
				if(i == 0 || i > temp) {
					answer += input.charAt(i);
					temp = (i + cnt);
				}
			}
			
			System.out.println(answer);
			
			input = br.readLine();
			
			if(input.equals("Was it a cat I saw?")) {
				break;
			}
			
			cnt++;
		}
	}
}
