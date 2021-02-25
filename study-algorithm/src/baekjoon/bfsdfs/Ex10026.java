package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10026 {
	
	static int n;
	static char[][] graph;
	static boolean[][] isVisited;
	static char[] colors = {'R', 'B', 'G'};
	static char color;
	static int[] answers = new int[2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		graph = new char[n][n];
		isVisited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			for(int j=0; j<n; j++) {
				graph[i][j] = input.charAt(j);
			}
		}
		
		for(int a=0; a<colors.length; a++) {
			color = colors[a];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(dfs(i, j)) {
						answers[0]++;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(isVisited[i][j]) {
					isVisited[i][j] = false;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(graph[i][j] == 'G') {
					graph[i][j] = 'R';
				}
			}
		}
		
		for(int a=0; a<colors.length; a++) {
			color = colors[a];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(dfs(i, j)) {
						answers[1]++;
					}
				}
			}
		}
		
		for(int answer : answers) {
			System.out.print(answer + " ");
		}
		
	}
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;	
		}
		
		if(!isVisited[x][y] && graph[x][y] == color) {
			isVisited[x][y] = true;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			
			return true;
		}
		
		return false;
	}
}
