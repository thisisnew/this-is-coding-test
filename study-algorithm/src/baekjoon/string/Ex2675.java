package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2675 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<String>();
		
		int cnt = 0;
		while(t != cnt) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			String answer = "";
			
			for(int j=0; j<s.length(); j++) {
				
				char c = s.charAt(j);
				
				for(int i=0; i<r; i++) {
					answer += c;
				}
			}
			
			list.add(answer);
			
			cnt++;
		}
		
		
		for(String answer : list) {
			System.out.println(answer);
		}
	}
}
