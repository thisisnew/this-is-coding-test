package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex2747 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		
		for(int i=2; i<=n; i++) {
			int a = list.get(i-2);
			int b = list.get(i-1);
			
			list.add(a+b);
		}
		
		System.out.println(list.get(n));
		
	}
}
