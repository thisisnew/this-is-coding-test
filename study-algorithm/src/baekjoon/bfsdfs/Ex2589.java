package baekjoon.bfsdfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2589 {
	
	private int a, b, cnt;
	
	public Node2589(int a, int b, int cnt) {
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

public class Ex2589 {
	
	static int m, n;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int bfs() {
		Queue<Node2589> q = new LinkedList<Node2589>();
		int cnt = 0;

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 1) {
					q.offer(new Node2589(i, j, 0));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Node2589 node = q.poll();
			cnt = node.getCnt();
			
			for(int i=0; i<4; i++) {
				int nx = node.getA() + dx[i];
				int ny = node.getB() + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(graph[nx][ny] == 0) {
					graph[nx][ny] = 1;
					q.offer(new Node2589(nx, ny, cnt + 1));
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		scanner.nextLine();
		
		graph = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str = scanner.nextLine();
			
			for(int j=0; j<m; j++) {
				graph[i][j] = trans(str.charAt(j));
			}
		}
		
		System.out.println(bfs());
	}
	
	static int trans(char value) {
		if(value == 'W') {
			return 0;
		} else {
			return 1;
		}
	}
}
