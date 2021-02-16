package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2667 {
	
	static int n, cnt;
	static int[][] graph = new int[26][26];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			for(int j=0; j<n; j++) {
				graph[i][j] = input.charAt(j) - '0';
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(dfs(i,j)) {
					list.add(cnt);
					cnt = 0;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	static boolean dfs(int x, int y) {
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		
		if(graph[x][y] == 1) {
			cnt++;
			graph[x][y] = 0;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			
			return true;
		}
		
		return false;
	}
	
}
