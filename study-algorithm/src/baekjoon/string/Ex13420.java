package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex13420 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			BigInteger a = new BigInteger(st.nextToken());
			
			String op = st.nextToken();
			
			BigInteger b = new BigInteger(st.nextToken());
			
			String eq = st.nextToken();
			
			BigInteger c = new BigInteger(st.nextToken());
			
			BigInteger result = null;
			
			if(op.equals("+")) {
				result = a.add(b); 
			}
			
			if(op.equals("-")) {
				result = a.subtract(b);
			}
			
			if(op.equals("*")) {
				result = a.multiply(b);
			}
			
			if(op.equals("/")) {
				result = a.divide(b);
			}
			
			if(result.equals(c)) {
				System.out.println("correct");
			} else {
				System.out.println("wrong answer");
			}
		}
	}
}
