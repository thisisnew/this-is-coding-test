package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2455 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<Integer>();
		
		int n = 0;
		
		for(int i=0; i<4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n -= Integer.parseInt(st.nextToken());
			n += Integer.parseInt(st.nextToken());
			
			list.add(n);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		
		System.out.println(list.get(0));
	}
}
