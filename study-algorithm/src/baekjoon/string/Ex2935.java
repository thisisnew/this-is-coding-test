package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ex2935 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger x = new BigInteger(br.readLine());
		String op = br.readLine();
		BigInteger y = new BigInteger(br.readLine());
		
		System.out.println(calc(x, op, y));
	}
	
	static BigInteger calc(BigInteger x, String op, BigInteger y) {

		if(op.equals("+")) {
			return x.add(y);
		} else {
			return x.multiply(y);
		}
		
	}
}
