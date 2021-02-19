package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int i = Integer.parseInt(st.nextToken());
			
			if(i < x) {
				list.add(i);
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			if(i == list.size()-1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + " ");
			}
		}
		
	}
}
