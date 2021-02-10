package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex8958 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			String ox = br.readLine();

			int cnt = 0;
			int total = 0;

			for(int j=0; j<ox.length(); j++) {
				
				if(ox.charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				
				total += cnt;
			}
			
			arr[i] = total;
		}
		
		for(int point : arr) {
			System.out.println(point);
		}
		
	}
}
