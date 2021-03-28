package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		
		int[] cups = new int[] {1,2,3}; 
		
		for(int i=0; i<M; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int idxA = 0;
			int idxB = 0;
			
			for(int j=0; j<cups.length; j++) {
				
				if(cups[j] == a) {
					idxA = j;
				}
				
				if(cups[j] == b) {
					idxB = j;
				}
				
			}
			
			int temp = cups[idxA];
			cups[idxA] = cups[idxB];
			cups[idxB] = temp;
			
		}
		
		System.out.println(cups[0]);
		
	}
}
