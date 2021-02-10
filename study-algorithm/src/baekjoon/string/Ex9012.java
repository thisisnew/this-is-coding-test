package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9012 {
	public static void main(String[] args) throws IOException {
		String[] arr;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new String[num];
		
		for(int i=0; i<arr.length; i++) {
			String check = check(br.readLine());
			arr[i] = check;
		}
		
		for(String answer : arr) {
			System.out.println(answer);
		}
	}
	
	static String check(String words) {
		int cnt = 0;
		
		for(int i=0; i<words.length(); i++){
			if(words.charAt(i) == '(') {
				cnt++;
			}else {
				if(cnt == 0) {
					return "NO";
				}
				cnt--;
			}
		}
		
		if(cnt != 0) {
			return "NO";
		}
		
		return "YES";
	}
}
