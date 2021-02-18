package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] distance = new long[n-1];
		long[] cities = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<distance.length; i++) {
			distance[i] = Long.parseLong(st.nextToken()); 
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<cities.length; i++) {
			cities[i] = Long.parseLong(st.nextToken()); 
		}
		
		long sum = 0;
		long min = cities[0];
		
		for(int i=0; i<distance.length; i++) {
			if(cities[i] < min) {
				min = cities[i]; 
			} 
			
			sum += min*distance[i];
		}
		
		System.out.println(sum);
		
	}
}
