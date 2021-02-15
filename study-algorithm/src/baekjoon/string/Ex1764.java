package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1764 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			map.put(name, name);
		}

		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			
			if(map.containsKey(name)) {
				list.add(name);
			}
		}
		
		System.out.println(list.size());
		
		Collections.sort(list);
		
		for(String name : list) {
			System.out.println(name);
		}
	}
}
