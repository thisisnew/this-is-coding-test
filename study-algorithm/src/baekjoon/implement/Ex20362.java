package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex20362 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String winner = st.nextToken();
		
		String answer = "";
		
		List<String> list = new Stack<String>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String ans = st.nextToken();
			
			if(name.equals(winner)) {
				answer = ans;
				break;
			}
			
			list.add(ans);
		}
		
		int cnt = 0;
		
		for(String s : list) {
			if(s.equals(answer)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
