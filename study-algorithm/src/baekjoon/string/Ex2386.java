package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2386 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(input);
			String alp = st.nextToken();
			
			String sentence = "";
			
			while(st.hasMoreTokens()) {
				sentence += st.nextToken() + " ";
			}
			
			int cnt = 0;
			
			for(int i=0; i<sentence.length(); i++) {
				String c = Character.toString(sentence.charAt(i)).toUpperCase();
				
				if(alp.toUpperCase().equals(c)) {
					cnt++;
				}
			}
			
			System.out.println(alp + " " + cnt);
			
			input = br.readLine();
			
			if(input.equals("#")) {
				break;
			}
		}
	
		
	}
}
