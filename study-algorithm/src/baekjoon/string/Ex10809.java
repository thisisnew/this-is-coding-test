package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int j=97; j<=122; j++) {
			map.put(j, -1);
		}
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			int value = map.get((int) c);
			
			if(value == -1) {
				map.put((int) c, i);
			}
		}
		
		for(Integer key : map.keySet()) {
			System.out.print(map.get(key) + " ");
		}
	}
}
