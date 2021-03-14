package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(",");
		
		int sum = 0;
		
		for(String s : input) {
			
			sum += Integer.parseInt(s);
			
		}
		
		System.out.println(sum);
	}
}
