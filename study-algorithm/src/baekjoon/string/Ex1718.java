package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1718 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dec = br.readLine();
		int decLen = dec.length();

		String key = br.readLine();
		int keyLen = key.length();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<decLen; i++) {
			char decC = dec.charAt(i);
			
			if(decC == ' ') {
				sb.append(' ');
				continue;
			}
			
			int keyIdx = key.charAt(i % keyLen) - 96;
			sb.append((char)(decC - keyIdx < 97 ? (decC - keyIdx + 26) : decC - keyIdx));
		}
		
		System.out.println(sb);
	}
}
