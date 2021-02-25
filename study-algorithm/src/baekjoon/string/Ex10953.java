package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10953 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			
			arr[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());  
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
}
