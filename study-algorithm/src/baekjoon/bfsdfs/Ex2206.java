package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2206 {
	
	static int m, n;
	static int[][] graph;
	static int[][] breakArr;
	static int[][] resultArr;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][m+1];
		breakArr = new int[n+1][m+1];
		resultArr = new int[n+1][m+1];
		
		for(int[] row : breakArr) {
			Arrays.fill(row, 2);
		}
		
		for(int i=1; i<=n; i++) {
			String input = br.readLine();
			
			for(int j=1; j<=m; j++) {
				graph[i][j] = input.charAt(j-1) - '0';
			}
		}
		
		int answer = bfs(1,1);
		
		if(answer == 0) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}
	
	static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {x, y, 0});
		
		resultArr[x][y] = 1;
		breakArr[x][y] = 0;
		
		int cnt = 0;

		while(!q.isEmpty()) {
			
			int[] node = q.poll();
			
			x = node[0];
			y = node[1];
			cnt = node[2];
			
			if(x == n && y == m) {
				return resultArr[n][m];
			}
			
			for(int i=0; i<4; i++) {
				
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx < 1 || nx > n || ny < 1 || ny > m) {
					continue;
				}
				
				if(graph[nx][ny] == 1) {
					if(cnt == 0) {
						q.offer(new int[] {nx, ny, 1});
	                    resultArr[nx][ny] = resultArr[x][y] + 1;
	                    breakArr[nx][ny] = 1;
					}
				}
				
				if(graph[nx][ny] == 0) {
                    if(breakArr[nx][ny] > cnt) {
                        q.add(new int[] {nx, ny, cnt});
                        resultArr[nx][ny] = resultArr[x][y] + 1;
                        breakArr[nx][ny] = cnt;
                    }
				}
			}
		}
		
		return -1;
	}
}
