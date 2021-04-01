package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<int[]> list = new ArrayList<int[]>();
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		Map<Integer, Integer> xMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> yMap = new HashMap<Integer, Integer>();
		
		for(int[] arr : list) {
			
			int x = arr[0];
			int y = arr[1];
			
			if(xMap.containsKey(x)) {
				xMap.put(x, 2);
			} else {
				xMap.put(x, 1);
			}
			
			if(yMap.containsKey(y)) {
				yMap.put(y, 2);
			} else {
				yMap.put(y, 1);
			}
		}
		
		int x = 0;
		int y = 0;
		
		for(int i : xMap.keySet()) {
			if(xMap.get(i) == 1) {
				x = i;
				break;
			}
		}
		
		for(int i : yMap.keySet()) {
			if(yMap.get(i) == 1) {
				y = i;
				break;
			}
		}
		
		System.out.println(x + " " + y);
		
	}
}
