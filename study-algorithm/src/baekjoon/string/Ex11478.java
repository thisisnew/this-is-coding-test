package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Ex11478 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<s.length(); i++) {
			String c = Character.toString(s.charAt(i));

			set.add(c);
			
			for(int j=i+1; j<s.length(); j++) {
				c += s.charAt(j);
				
				set.add(c);
			}
		}
		System.out.println(set.size());
	}
}
