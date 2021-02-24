package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex7576 {
	
	static int m, n;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st =  new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(bfs());
		
	}
	
	static int bfs() {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 1) {
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			cnt = node[2];
			
			for(int i=0; i<4; i++) {
				int nx = node[0] + dx[i];
				int ny = node[1] + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(graph[nx][ny] == 0) {
					graph[nx][ny] = 1;
					q.offer(new int[] {nx, ny, cnt+1});
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 0) {
					cnt = -1;
					break;
				}
			}
		}
		
		return cnt;
	}
	
}
