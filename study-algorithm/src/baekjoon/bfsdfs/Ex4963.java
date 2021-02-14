package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4963 {
	
	static int n, m;
	static int[][] graph;
	static int answer = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String input = br.readLine();
			
			if(input.equals("0 0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(input, " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			answer = 0;
			graph = new int[n][m];
			
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0; j<m; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(dfs(i, j)) {
						answer++;
					}
				}
			}
			
			System.out.println(answer);
		}
	}
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		if(graph[x][y] == 1) {
			graph[x][y] = 0;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			dfs(x+1, y+1);
			dfs(x-1, y-1);
			dfs(x-1, y+1);
			dfs(x+1, y-1);
			
			return true;
		}
		
		return false;
	}
}
