package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2644 {
	
	static int n, m;
	static int[][] graph;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[] isVisited;
	static boolean find = false;
	
	static void bfs(int start, int end) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[]{start, 0});
		isVisited[start] = true;
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			
			int sta = node[0];
			int cnt = node[1];
			
			if(sta == end) {
				find = true;
				System.out.println(cnt);
				break;
			}
			
			for(int i=1; i<=n; i++) {
				if(!isVisited[i] && graph[sta][i] == 1) {
					isVisited[i] = true;
					q.offer(new int[]{i, cnt + 1});
				}
			}
		}
		
		if(!find) {
			System.out.println(-1);
		}
	}
	
	
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        graph = new int[n+1][n+1];
        isVisited = new boolean[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        m = Integer.parseInt(br.readLine());
        
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x][y] = graph[y][x] = 1; 
        }
        
        bfs(a, b);
	}
}
