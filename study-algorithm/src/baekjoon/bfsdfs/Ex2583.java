package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2583 {
	
	static int k, m, n;
	static int[][] graph = new int[101][101];
	static List<Integer> list = new ArrayList<Integer>();
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			
			setSqure(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i, j)) {
					list.add(cnt);
					cnt = 0;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		
	}
	
	static void setSqure(int lx, int ly, int rx, int ry) {
        for(int i=ly; i<ry; i++){
            for(int j=lx; j<rx; j++) {
                graph[i][j] = 1;
            }
        }
    }
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;	
		}
		
		if(graph[x][y] == 0) {
			cnt++;
			
			graph[x][y] = 1;
			
			dfs(x-1,y);
			dfs(x+1,y);
			dfs(x,y-1);
			dfs(x,y+1);
			
			return true;
		}
		
		return false;
	}
}
