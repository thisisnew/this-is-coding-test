package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex9584 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '*') {
				list.add(i);
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		List<String> answerList = new ArrayList<String>();
		
		for(int i=0; i<k; i++) {
			String s = br.readLine();
			
			String a = "";
			
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				
				if(list.contains(j)) {
					c = '*';
				}
				
				a += c;
			}
			
			if(input.equals(a)) {
				answerList.add(s);
			}
		}
		
		System.out.println(answerList.size());
		
		for(String s : answerList) {
			System.out.println(s);
		}
	}
}
