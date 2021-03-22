package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex20291 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			
			String input = br.readLine().split("[.]")[1];
			
			int cnt = 1;
			
			if(map.containsKey(input)) {
				cnt = map.get(input) + 1;
			}
			
			map.put(input, cnt);
		}
		
		List<String> list = new ArrayList<String>(map.keySet());
		
		Collections.sort(list);
		
		for(String s : list) {
			System.out.println(s + " " + map.get(s));
		}
	}
}
