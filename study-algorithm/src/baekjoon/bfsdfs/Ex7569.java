package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Ex7569 {
	
	static int h, m, n;
	static int[][][] graph;
	static int[] dx = {-1, 1, 0, 0, 0, 0};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dh = {0, 0, 0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		graph = new int[h][n][m];
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				st =  new StringTokenizer(br.readLine());
				
				for(int k=0; k<m; k++) {
					graph[i][j][k] = Integer.parseInt(st.nextToken()); 
				}
			}
		}
		
		System.out.println(bfs());
		
	}
	
	static int bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					if(graph[i][j][k] == 1) {
						q.offer(new int[] {i, j, k, 0});
					} 
				}
			}
		}
		
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			int z = node[0];
			int x = node[1];
			int y = node[2];
			cnt = node[3];
			
			for(int i=0; i<6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nh = z + dh[i];
				
				if(nh < 0 || nh >= h || nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(graph[nh][nx][ny] == 0) {
					graph[nh][nx][ny] = 1;
					q.offer(new int[] {nh, nx, ny, cnt+1});
				}
			}
			
		}
		
		if(!check()) {
			cnt = -1;
		}
		
		return cnt;
	}
	
	static boolean check() {
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					if(graph[i][j][k] == 0) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
