package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] arr = new String[input.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Character.toString(input.charAt(i));
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb.toString());
		
	}
}
