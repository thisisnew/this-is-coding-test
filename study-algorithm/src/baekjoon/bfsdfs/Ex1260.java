package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Ex1260 {
	
	static int m, n, v;
	static int[][] graph;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][n+1];
		isVisited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1; 
		}
		
		dfs(v);
		
		Arrays.fill(isVisited, false);
		
		System.out.println();
		
		bfs(v);
		
	}
	
	static void dfs(int x) {
		
		System.out.print(x + " ");
		
		isVisited[x] = true;
		
		for(int i=1; i<=n; i++) {
			if(!isVisited[i] && graph[x][i] == 1) {
				dfs(i);
			}
		}
		
	}
	
	static void bfs(int x) {
		isVisited[x] = true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		
		while(!q.isEmpty()) {
			
			int y = q.poll();
			
			System.out.print(y + " ");
			
			for(int i=1; i<=n; i++) {
				if(!isVisited[i] && graph[y][i] == 1) {
					isVisited[i] = true;
					q.offer(i);
				}
			}
		}
	}
	
}
