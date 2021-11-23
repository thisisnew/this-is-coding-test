package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex2789 {

	static final String CAMBRIDGE = "CAMBRIDGE";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(!CAMBRIDGE.contains(String.valueOf(c))) {
				list.add(c);
			}	
		}
		
		for(char c : list) {
			System.out.print(c);
		}
	}
}
