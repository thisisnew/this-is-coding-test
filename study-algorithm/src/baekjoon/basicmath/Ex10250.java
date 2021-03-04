package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int[][] hotel = new int[h][w];
			
			for(int j=1; j<=h; j++) {
			
				int floor = j * 100; 
				
				for(int k=1; k<=w; k++) {
					hotel[j-1][k-1] = floor + k;
				}
			}
			
			int cnt = 1;
			int answer = 0;
			
			loop :
			for(int j=0; j<w; j++) {
				for(int k=0; k<h; k++) {
					
					int tt = hotel[k][j];
					
					if(cnt == n) {
						answer = hotel[k][j];
						break loop;
					}
					cnt++;
				}
			}
			
			System.out.println(answer);
		}
	}
}
