package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Ex4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int sum = 0;
		
		while(true) {
			
			map.put(input, map.getOrDefault(input, 0) + 1);
			sum++;
			
			input = br.readLine();
			
			if(input == null || input.length() == 0) {
				break;
			}
			
		}
	
		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);
		
		StringBuilder sb = new StringBuilder();
		
		for(Object key : mapKey) {
			String keyStr = (String) key;
			int count = map.get(keyStr);
			double per = (double)(count * 100.0) / sum;
			
			sb.append(keyStr + " " + String.format("%.4f", per) + "\n"); 
		}
		
		System.out.println(sb.toString());
	}
}
