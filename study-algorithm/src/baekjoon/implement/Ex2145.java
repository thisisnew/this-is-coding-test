package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Ex2145 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		while(true) {
			
			String v = n;
			
			while(v.length() >= 2) {
				int sum = 0;
				
				for(int i=0; i<v.length(); i++) {
					sum += Character.getNumericValue(v.charAt(i));
				}
				
				v = String.valueOf(sum);
			}
			
			System.out.println(v);
			
			n = br.readLine();
			
			if(n.equals("0")) {
				break;
			}
		}
		
	}
}
