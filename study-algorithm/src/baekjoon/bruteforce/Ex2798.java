package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2798 {
	
	static int n, m;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = calc(n);
		
		System.out.println(answer);
	}
	
	static int calc(int n) {
		
		int answer = 0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-2; j++) {
				for(int k=j+1; k<n; k++) {
					int total = arr[i] + arr[j] + arr[k];
					
					if(total == m) {
						return total;
					}
					
					if(total < m && total > answer) {
						answer = total;
					}
				}
			}
		}
		
		return answer;
	}
}
