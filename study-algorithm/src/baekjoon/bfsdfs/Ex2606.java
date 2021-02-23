package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2606 {
	
	static int m, n;
	static int[][] graph;
	static boolean[] isVisited;
	static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		graph = new int[n+1][n+1];
		isVisited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		dfs(1);
		
		System.out.println(answer);
	}
	
	static void dfs(int x) {
		isVisited[x] = true;
		
		for(int i=1; i<=n; i++) {
			if(!isVisited[i] && graph[x][i] == 1) {
				answer++;
				isVisited[i] = true;
				dfs(i);
			}
		}
		
	}
}