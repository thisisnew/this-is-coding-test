package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Ex17094 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] array = new int[2];
		
		for(int i=0; i<n; i++) {
			
			char c = input.charAt(i);
			
			if(c == '2') {
				array[0]++;
			}
			
			if(c == 'e') {
				array[1]++;
			}
			
		}
		
		if(array[0] == array[1]) {
			System.out.println("yee");
		}
		
		if(array[0] > array[1]) {
			System.out.println("2");
		}
		
		if(array[0] < array[1]) {
			System.out.println("e");
		}
	}
}
