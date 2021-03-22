package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex15238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[26];
		
		String input = br.readLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<n; i++) {
			int cnt = 1;
			
			char c = input.charAt(i);
			
			if(map.containsKey(c)) {
				cnt = map.get(c) + 1;
			}
			
			map.put(c, cnt);
		}
		
		List<Character> list = new ArrayList<Character>(map.keySet());
		
		Collections.sort(list, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				
				int a = map.get(o1);
				int b = map.get(o2);
				
				return b - a;
			}
		
		});
		
		System.out.println(list.get(0) + " " + map.get(list.get(0)));
	}
}
