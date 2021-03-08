package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "-");
			
			String alp = st.nextToken();
			
			int alpNum = 0;
			int power = alp.length() - 1;
			
			for(int j=0; j<alp.length(); j++) {
				alpNum += (alp.charAt(j) - 'A') * (int) Math.pow(26, power);
				power--;
			}
			
			int num = Integer.parseInt(st.nextToken());
			
			if(Math.abs(alpNum - num) > 100) {
				System.out.println("not nice");
			} else {
				System.out.println("nice");
			}
			
		}
		
	}
}
