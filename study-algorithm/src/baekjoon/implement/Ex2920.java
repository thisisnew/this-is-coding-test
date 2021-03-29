package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[8];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<8; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int diff = array[1] - array[0];
		int len = 1;
		
		boolean isMixed = false;
		
		while(len < array.length-1) {
			
			int tempDiff = array[len+1] - array[len];
			
			if(diff != tempDiff) {
				isMixed = true;
				break;
			}
			
			len++;
		}
		
		if(isMixed) {
			System.out.println("mixed");
			return;
		} 
		
		if(diff > 0) {
			System.out.println("ascending");
		} else {
			System.out.println("descending");
		}
	}
}
