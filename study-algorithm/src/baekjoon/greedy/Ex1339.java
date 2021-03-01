package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1339 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] array = new String[n];

		for(int i=0; i<array.length;i++) {
			array[i] = br.readLine();
		}
		
		int[] intArray = new int[26];
		
		for(int i=0; i<array.length;i++) {
			String st = array[i];
			int pow = (int) Math.pow(10, array[i].length()-1);
			
			for(int j=0; j<st.length(); j++) {
				char c = st.charAt(j);
				intArray[(int)c - 65] += pow;
				
				pow /= 10;
			}
		}
		
		Arrays.sort(intArray);
	
		int cnt = 9;
		int sum = 0;
		
		for(int i=intArray.length-1; i>=0; i--) {
			if(intArray[i] == 0) {
				break;
			}
			
			sum += intArray[i] * cnt;
			cnt--;
		}
		
		System.out.println(sum);
	}
}
