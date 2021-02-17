package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node7569 {
	private int a, b, c, cnt;
	
	public Node7569(int a, int b, int c, int cnt) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.cnt = cnt;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public int getCnt() {
		return cnt;
	}
}

public class Ex7569 {
	
	static int h, m, n;
	static int[][][] graph;
	static int[] dx = {-1, 1, 0, 0, 0, 0};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dh = {0, 0, 0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		graph = new int[h][n][m];
		
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0; j<m; j++) {
					graph[k][i][j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		System.out.println(bfs());
		
	}
	
	static int bfs() {
		
		Queue<Node7569> q = new LinkedList<Node7569>();
		
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(graph[k][i][j] == 1) {
						q.offer(new Node7569(i, j, k, 0));
					}
				}
			}
		}
	
		int cnt = 0;
		
		while(!q.isEmpty()) {
			Node7569 node = q.poll();
			cnt = node.getCnt();
			
			for(int i=0; i<6; i++) {
				int nx = node.getA() + dx[i];
				int ny = node.getB() + dy[i];
				int nh = node.getC() + dh[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m || nh < 0 || nh >= h) {
					continue;
				}
				
				
				if(graph[nh][nx][ny] == 0) {
					graph[nh][nx][ny] = 1;
					
					q.offer(new Node7569(nx, ny, nh , cnt+1));
				}
			}
		}
		
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(graph[k][i][j] == 0) {
						cnt = -1;
					}
				}
			}
		}
		
		return cnt;
	}
}
