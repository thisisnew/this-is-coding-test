package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1697 {
	
	static int k, n;
	static int[] graph = new int[100001];
	static int[] dx = {-1, 1, 2};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		if(n >= k) {
			System.out.println(n-k);
		} else {
			System.out.println(bfs(n));
		}
	}
	
	static int bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		
		graph[x] = 1;
		
		while(!q.isEmpty()) {
			
			x = q.poll();
			
			for(int i=0; i<3; i++) {
				
				int nx = 0;
				
				if(i == 2) {
					nx = x * dx[i];
				} else {
					nx = x + dx[i];
				}
				
				if(nx < 0 || nx > 100000) {
					continue;
				}
				
				if(nx == k) {
					return graph[x];
				}
				
				if(graph[nx] == 0) {
					graph[nx] = graph[x] + 1;
					q.offer(nx);
				}
			}
		}
		
		return 0;
	}
}
