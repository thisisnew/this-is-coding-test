package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11724 {
	static int m, n, cnt;
	static int[][] graph;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][n+1];
		isVisited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = graph[v][u] = 1; 
		}
		
		for(int i=1; i<=n; i++) {
			if(!isVisited[i]) {
				if(dfs(i)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	static boolean dfs(int x) {
		
		if(isVisited[x]) {
			return false;
		}
	
		if(!isVisited[x]) {
			isVisited[x] = true;
			
			for(int i=1; i<=n; i++) {
				if(graph[x][i] == 1) {
					dfs(i);
				}
			}
			
			return true;
		}
		
		return false;
	}
}
