package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1260 {
	
	static int n, m, v;
	static int[][] array;
	static boolean[] isVisited;
	
	static void dfs(int i) {
		isVisited[i] = true;
		System.out.print(i + " ");
		
		for(int j=1; j<=n; j++) {
			if(!isVisited[j] && array[i][j] == 1) {
				dfs(j);
			}
		}
	}
	
	static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		isVisited[i] = true;
		
		while(!q.isEmpty()) {
			int t = q.poll();
			
			System.out.print(t + " ");
			
			for(int j=1; j<=n; j++) {
				if(!isVisited[j] && array[t][j] == 1) {
					q.offer(j);
					isVisited[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		isVisited = new boolean[n+1];
		array = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		
		dfs(v);
		System.out.println();
		Arrays.fill(isVisited, false);
		bfs(v);
	}
}
