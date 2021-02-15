package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex5545 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list, Collections.reverseOrder());

		for(int i=0; i<n; i++) {
			
			int calorie = 0;
			int price = 0;
			int doughCal = 0;
			int result = 0;
			int cnt = 0;
			
			for(int j=0; j<i; j++) {
				doughCal += list.get(j);
				cnt++;
			}
			
			calorie = c + doughCal;
			price = a + b * cnt;
			
			result = (int) Math.floor(calorie/price);
			
			if(result > answer) {
				answer = result;
			}
		}
		
		System.out.println(answer);
	}
}
