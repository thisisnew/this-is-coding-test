package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1926 {
	
	static int m, n, cnt;
	static int[][] graph = new int[500][500];
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i, j)) {
					list.add(cnt);
					cnt = 0;
				}
			}
		}
		
		if(list.size() > 0) {
			Collections.sort(list);
			
			System.out.println(list.size());
			System.out.println(list.get(list.size()-1));
		} else {
			System.out.println(0);
			System.out.println(0);
		}
	}
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		if(graph[x][y] == 1) {
			cnt++;
			
			graph[x][y] = 0;
			
			dfs(x+1, y);
			dfs(x-1, y);
			dfs(x, y+1);
			dfs(x, y-1);
			
			return true;
			
		}
		
		return false;
	}
	
}
