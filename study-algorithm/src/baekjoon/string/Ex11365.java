package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex11365 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		List<String> list = new ArrayList<String>();
		
		while(!(input = br.readLine()).equals("END")) {
			StringBuilder sb = new StringBuilder();
			
			for(int i=input.length()-1; i>=0; i--) {
				sb.append(input.charAt(i));
			}
			
			list.add(sb.toString());
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
