package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17350 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String name = "anj";
		
		boolean isExist = false;
		
		for(int i=0; i<n; i++) {
			
			String input = br.readLine().toLowerCase();
			
			if(input.equals(name)) {
				isExist = true;
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("뭐야?");
		} else {
			System.out.println("뭐야;");	
		}
	}
}
