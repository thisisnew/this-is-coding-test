package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if(!numMap.containsKey(input)) {
				numMap.put(input, 1);
			} else {
				int count = numMap.get(input);
				numMap.put(input, count + 1);
			}
	
		}
		
		System.out.println(numMap.get(v));
	}
}
