package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node7576 {
	private int a, b, cnt;
	
	public Node7576(int a, int b, int cnt) {
		this.a = a;
		this.b = b;
		this.cnt = cnt;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getCnt() {
		return cnt;
	}
}


public class Ex7576 {
	
	static int m, n;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
//		for(int i=0; i<n; i++) {
//			System.out.println();
//			for(int j=0; j<m; j++) {
//				System.out.print(graph[i][j] + " ");
//			}
//		}
		
		System.out.println(bfs());
	}
	
	static int bfs() {
		Queue<Node7576> q = new LinkedList<Node7576>();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 1) {
					q.offer(new Node7576(i, j, 0));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Node7576 node = q.poll();
			cnt = node.getCnt();
			
			for(int i=0; i<4; i++) {
				int nx = node.getA() + dx[i];
				int ny = node.getB() + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(graph[nx][ny] == 0) {
					graph[nx][ny] = 1;
					q.offer(new Node7576(nx, ny, cnt+1));
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 0) {
					cnt = -1;
				}
			}
		}
		
		return cnt;
	}
	
}
