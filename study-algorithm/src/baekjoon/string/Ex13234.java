package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex13234 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String pre = st.nextToken();
		
		String op = st.nextToken();
		
		String post =  st.nextToken();
		
		if(op.equals("AND")) {
			
			if(pre.equals("true") && post.equals("true")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			
		}
		
		if(op.equals("OR")) {
			if(pre.equals("false") && post.equals("false")) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
		
	}
}
