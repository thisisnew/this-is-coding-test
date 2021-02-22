package baekjoon.whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = 0;
		int b = 0;
		String input;
		List<Integer> list = new ArrayList<Integer>();
		
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			list.add(a+b);
			
		}
		
		for(int i : list) {
			System.out.println(i);
		}
	}
}
