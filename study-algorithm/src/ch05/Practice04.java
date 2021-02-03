package ch05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nodes {
	
	private int a;
	private int b;
	
	public Nodes(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}
}

public class Practice04 {
	static int n, m;
	static int[][] array = new int[201][201];
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int bfs(int x, int y) {
		Queue<Nodes> q = new LinkedList<Nodes>();
		q.offer(new Nodes(x, y));
		
		while(!q.isEmpty()) {
			Nodes nodes = q.poll();
			x = nodes.getA();
			y = nodes.getB();
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx<0 || nx>=n || ny<0 || ny>=m) {
					continue;
				}
				
				if(array[nx][ny] == 0) {
					continue;
				}
				
				if(array[nx][ny] == 1) {
					array[nx][ny] = array[x][y] + 1;
					q.offer(new Nodes(nx, ny));
				}
			}
		}
		
		
		return array[n-1][m-1] ;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			String words = scan.nextLine();

			for(int j=0; j<m; j++) {
				array[i][j] = Character.getNumericValue(words.charAt(j));
			}
		}
		
		System.out.println(bfs(0,0));
	}
}
