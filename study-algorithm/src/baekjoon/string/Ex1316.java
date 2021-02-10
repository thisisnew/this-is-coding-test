package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			if(isGroupWord(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	static boolean isGroupWord(String word) {
		for(int i=0; i<word.length(); i++) {
			int idx = word.indexOf(word.charAt(i));
			
			while(idx >= 0) {
				int pre = idx;
				idx = word.indexOf(word.charAt(i), idx+1);
				
				if(idx != -1 && idx != pre+1) {
					return false;
				}
			}
		}
		
		return true;
	}
}
