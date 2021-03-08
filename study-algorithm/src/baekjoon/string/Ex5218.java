package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5218 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String input = st.nextToken();
			String compInput = st.nextToken();
			
			int[] array = new int[input.length()];
			
			for(int j=0; j<input.length(); j++) {
				int x = (int) input.charAt(j) - 64;
				int y = (int) compInput.charAt(j) - 64;
				
				if(y >= x) {
					array[j] = y-x;
				} 
				
				if(y < x) {
					array[j] = (y+26) - x;
				}
			}
			
			String answer = "Distances: ";
			
			for(int val : array) {
				answer += val + " ";
			}
			
			System.out.println(answer);
			
		}
	}
}
