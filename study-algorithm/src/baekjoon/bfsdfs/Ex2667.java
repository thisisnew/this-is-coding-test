package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2667 {
	
	static int n;
	static int[][] graph;
	static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		graph = new int[n+1][n+1];
		
		for(int i=0; i<n; i++) {
			
			String input = br.readLine();
			
			for(int j=0; j<n; j++) {
				graph[i][j] = input.charAt(j) - '0';
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(dfs(i, j)) {
					list.add(answer);
					answer = 0;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int answer : list) {
			System.out.println(answer);
		}
	}
	
	static boolean dfs(int x, int y) {
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		
		if(graph[x][y] == 1) {
			graph[x][y] = 0;
			answer++;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			
			return true;
		}
		
		return false;
	}
	
}
