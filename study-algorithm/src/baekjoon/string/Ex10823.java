package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10823 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		int sum = 0;
		
		StringBuffer sb = new StringBuffer();
		
		while((input = br.readLine()) != null) {
			sb.append(input);
		}
		
		StringTokenizer st = new StringTokenizer(sb.toString(), ",");
		
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		
	}
}
