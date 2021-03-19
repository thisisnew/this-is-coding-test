package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex3181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> list = Arrays.asList("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String answer = "";
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			cnt++;
			
			if(list.contains(s) && cnt > 1) {
				continue;
			}
			
			answer += s.charAt(0);
			
		}
		
		System.out.println(answer.toUpperCase());
	}
}
