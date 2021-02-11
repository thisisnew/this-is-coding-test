package baekjoon.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Nodes7576 {
	private int a, b, cnt;
	
	public Nodes7576(int a, int b, int cnt) {
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
	
	static int n, m;
	static int[][] array;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int bfs() {
		Queue<Nodes7576> q = new LinkedList<Nodes7576>();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(array[i][j] == 1) {
					q.offer(new Nodes7576(i, j, 0));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Nodes7576 node = q.poll();
			cnt = node.getCnt();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i] + node.getA();
				int ny = dy[i] + node.getB();
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				
				if(array[nx][ny] == 0) {
					array[nx][ny] = 1;
					q.offer(new Nodes7576(nx, ny, cnt+1));
				}
			}
		}
		
		return check() ? cnt : -1;
	}
	
	static boolean check() {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(array[i][j] == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringTokenizer inserts = new StringTokenizer(scanner.nextLine());
		m = Integer.parseInt(inserts.nextToken());
		n = Integer.parseInt(inserts.nextToken());
		
		array = new int[n][m];
		
		for(int i=0; i<n; i++) {
			inserts = new StringTokenizer(scanner.nextLine());
			
			for(int j=0; j<m; j++) {
				array[i][j] = Integer.parseInt(inserts.nextToken());
			}
		}
		
		System.out.println(bfs());
	}
}
