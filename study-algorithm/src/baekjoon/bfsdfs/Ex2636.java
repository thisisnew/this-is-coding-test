package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node2636 {
	private int a, b;
	
	public Node2636(int a, int b) {
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

public class Ex2636 {
	
	static int n, m;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int answer;
	static int pre;
	static int remain;
	
	static void bfs() {
		
		Queue<Node2636> q = new LinkedList<Node2636>();
		Queue<Node2636> copy = new LinkedList<Node2636>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == 1) {
					q.offer(new Node2636(i, j));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Node2636 node = q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = node.getA() + dx[i];
				int ny = node.getB() + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(graph[nx][ny] == 0) {
					copy.offer(new Node2636(node.getA(), node.getB()));
				}
			}
		}
		
		if(!copy.isEmpty()) {
			answer++;
			
			pre = remain;
			remain = copy.size(); 
			
			while(!copy.isEmpty()) {
				Node2636 node = copy.poll();
				
				int nx = node.getA();
				int ny = node.getB();
				
				graph[nx][ny] = 0;
			}
			
			for(int i=0; i<n; i++) {
				System.out.println();
				
				for(int j=0; j<m; j++) {
					System.out.print(graph[i][j] + " ");
				}
			}
			
			System.out.println();
			
			bfs();
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println();
			
			for(int j=0; j<m; j++) {
				System.out.print(graph[i][j] + " ");
			}
		}
		
		System.out.println();
		
		bfs();
		
		System.out.println(answer);
		System.out.println(remain);
		System.out.println(pre);
	}
}
