package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];

		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		for(String input : arr) {
			String[] inputs = input.split(" ");
			inputs[0] = "god";
			
			String answer = "";
			for(String s : inputs) {
				answer += s;
			}
			
			System.out.println(answer);
		}
	}
}	
