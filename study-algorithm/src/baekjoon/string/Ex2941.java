package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2941 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String input = br.readLine();

		for(String arg : arr) {
			
			if(input.indexOf(arg) > -1) {
				input = input.replaceAll(arg, "#");
			}
		}
		
		System.out.println(input.length());
	}
}
