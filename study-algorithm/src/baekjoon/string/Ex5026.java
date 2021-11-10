package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			if(input.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				
				String k = input.split("\\+")[0];
				String m = input.split("\\+")[1];
				
				int a = Integer.parseInt(k);
				int b = Integer.parseInt(m);
				int sum = a+b;
				
				System.out.println(sum);
			}
		}
	}
}
