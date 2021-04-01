package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			if(st.countTokens() == 1 && st.nextToken().equals("0")) {
				break;
			}
			
			int[] array = new int[st.countTokens()];
			
			int idx = 0;
			
			while(st.hasMoreTokens()) {
				array[idx] = Integer.parseInt(st.nextToken());
				idx++;
			}
			
			int temp = 0;
			
			for(int i=1; i<array.length; i++) {
				
				if(temp == array[i]) {
					continue;
				} else {
					System.out.print(array[i] + " ");
					temp = array[i];
				}
			}
			
			System.out.println("$");
		}
	}
}