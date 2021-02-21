package baekjoon.onedimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			 st = new StringTokenizer(br.readLine());
			 
			 int[] arr = new int[st.countTokens()];
			 int sum = 0;
			 
			 for(int j=0; j<arr.length; j++) {
				 arr[j] = Integer.parseInt(st.nextToken());
				 
				 if(j > 0) {
					 sum += arr[j];
				 }
			 }
			 
			 int total = arr[0];
			 int avg = sum/total;
			 int cnt = 0;
			 
			 for(int j=1; j<arr.length; j++) {
				 if(arr[j] > avg) {
					 cnt++;
				 }
			 }
			 
			 System.out.printf("%.3f", 100.0 * cnt / total);
	         System.out.println("%");
		}

	}
}
