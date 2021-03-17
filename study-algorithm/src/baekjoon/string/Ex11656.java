package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11656 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i<input.length(); i++) {
			list.add(input.substring(i));
		}
		
		Collections.sort(list);
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}
