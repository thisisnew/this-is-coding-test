package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1743 {
	
	static int n, m, k;
	static int[][] graph;
	static int max = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][m+1];

		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = 1;
		}
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				if(graph[i][j] == 1) {
					int cnt = dfs(i, j);
					
					if(cnt > max) {
						max = cnt;
					}
				}
			}
		}
		
		System.out.println(max);
	}
	
	static int dfs(int x, int y) {
		if(graph[x][y] == 0) {
			return 0;
		}
		
		int cnt = 1;
		
		graph[x][y] = 0;
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1}; 
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < 0 || nx > n || ny < 0 || ny > m) {
				continue;
			}
			
			if(graph[nx][ny] == 0) {
				continue;
			}
			
			cnt += dfs(nx, ny);
		}
		
		return cnt;
	}
}
