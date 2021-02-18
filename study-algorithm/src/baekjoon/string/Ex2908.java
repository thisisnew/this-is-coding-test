package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String arg = "";
		
		String A = st.nextToken();
		
		for(int i=2; i>=0; i--) {
			arg += A.charAt(i);
		}
		
		A = arg;
		arg = "";
		
		String B = st.nextToken();
		
		for(int i=2; i>=0; i--) {
			arg += B.charAt(i);
		}
		
		B = arg;
		
		if(Integer.parseInt(B) > Integer.parseInt(A)) {
			System.out.println(B);
		} else {
			System.out.println(A);
		}
		
	}
}
