package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex5596 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[2];
		
		for(int i=0; i<2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int sum = 0;
			
			while(st.hasMoreTokens()) {
				
				sum += Integer.parseInt(st.nextToken());
				
			}
			
			array[i] = sum;
		}
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
		
	}
}
