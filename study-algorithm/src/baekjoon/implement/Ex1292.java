package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[] array = new int[b];
		
		int n = 1;
		int cnt = 0;
		
		for(int i=0; i<b; i++) {
			
			if(cnt == n) {
				cnt = 0;
				n++;
			}
			
			array[i] = n;
			
			cnt++;
		}
		
		int sum = 0;
		
		for(int i=a-1; i<b; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
		
	}
}
