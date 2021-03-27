package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2693 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			List<Integer> list = new ArrayList<Integer>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {

				int n = Integer.parseInt(st.nextToken());
				
				list.add(n);
			}
			
			Collections.sort(list, Collections.reverseOrder());
			
			System.out.println(list.get(2));
			
		}
		
	}
}
