package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1012 {
	
	static int t, m , n, k;
	static int[][] graph;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		t = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(cnt != t) {
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			graph = new int[n][m];
			
			for(int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				graph[b][a] = 1;
			}
			
			int answer = 0;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(dfs(i, j)) {
						answer++;
					}
				}
			}
			
			System.out.println(answer);
			cnt++;
		}
	}
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		if(graph[x][y] == 1) {
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
