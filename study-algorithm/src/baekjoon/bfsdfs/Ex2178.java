package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node2178 {
	private int a, b;
	
	public Node2178(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

}

public class Ex2178 {
	
	static int m, n;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = input.charAt(j) - '0';
			}
		}
		System.out.println(bfs(0, 0));
	}
	
	static int bfs(int x, int y) {
		Queue<Node2178> q = new LinkedList<Node2178>();
		q.offer(new Node2178(x, y));
		
		while(!q.isEmpty()) {
			
			Node2178 node = q.poll();
			x = node.getA();
			y = node.getB();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				
				if(nx < 0 || nx >= n || ny < 0 || ny >=m) {
					continue;
				}
				
				if(graph[nx][ny] == 0) {
					continue;
				}
				
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node2178(nx, ny));
				}
			}
		}
		
		return graph[n-1][m-1];
	}
}
