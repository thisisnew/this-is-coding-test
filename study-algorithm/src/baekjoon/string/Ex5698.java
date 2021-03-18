package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5698 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toLowerCase();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(input);
			
			char firstLetter = st.nextToken().charAt(0);
			
			boolean isTautogram = true;
			
			while(st.hasMoreTokens()) {
				
				if(st.nextToken().charAt(0) != firstLetter) {
					isTautogram = false;
					break;
				}
			}
			
			if(!isTautogram) {
				System.out.println("N");
			} else {
				System.out.println("Y");
			}
			
			input = br.readLine().toLowerCase();
			
			if(input.equals("*")) {
				break;
			}
		}
	}
}
