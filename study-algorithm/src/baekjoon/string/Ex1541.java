package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, "-");
		List<Integer> list = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			StringTokenizer add = new StringTokenizer(st.nextToken(), "+");
			int temp = 0;
			
			while(add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken()); 
			}
			
			list.add(temp);
		}
		
		int answer = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			answer -= list.get(i);
		}
		
		System.out.println(answer);
		
	}
}
