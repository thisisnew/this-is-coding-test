package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10798 {
	public static void main(String[] args) throws IOException {

		char[][] array = new char[5][15];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";

		for (int i = 0; i < array.length; i++) {
			String input = br.readLine();

			for(int j=0; j<input.length(); j++) {
				array[i][j] = input.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for (int j=0; j<5; j++) {
				
				if(array[j][i]==' ' || array[j][i] =='\0') {
					continue;
				}
				
				answer += array[j][i];
			}
		}

		System.out.println(answer);
	}
}
