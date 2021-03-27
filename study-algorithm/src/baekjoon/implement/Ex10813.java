package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[n];
		
		for(int i=1; i<=n; i++) {
			basket[i-1] = i;
		}
		
		for(int i=0; i<m; i++) {
		
			StringTokenizer tk = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(tk.nextToken()) -1;
			int b = Integer.parseInt(tk.nextToken()) -1;
			
			int temp = basket[a];
			basket[a] = basket[b];
			basket[b] = temp; 
		}
		
		for(int i : basket) {
			System.out.print(i + " ");
		}
	}
}
