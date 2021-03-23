package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex2953 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int[][] array = new int[5][2];
		 
		 for(int i=0; i<5; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 
			 int sum = 0;
			 
			 while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken()); 
			 }
			 
			 array[i][0] = i+1;
			 array[i][1] += sum;
		 }
		 
		 Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		 });
		 
		 System.out.println(array[0][0] + " " + array[0][1]);
	}
}
