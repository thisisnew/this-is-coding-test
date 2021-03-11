package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9243 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String before = br.readLine();
		String after = br.readLine();
		
		String comp = "";
		
		int[] arr = new int[before.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = before.charAt(i) - '0';
		}
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<arr.length; i++) {
				int a = arr[i];
				
				if(a == 1) {
					arr[i] = 0;
				} else if(a == 0) {
					arr[i] = 1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			comp += String.valueOf(arr[i]);
		}
		
		String answer = "Deletion ";
		
		if(after.equals(comp)) {
			answer += "succeeded";
		} else {
			answer += "failed";
		}
		
		System.out.println(answer);
	}
}
