package ch05;

import java.util.Scanner;

public class Practice03 {
	
	static int n, m;
	static int[][] array = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		
		if( x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		if(array[x][y] == 0) {
			array[x][y] = 1;
			
			dfs(x-1, y);
			dfs(x, y-1);
			dfs(x+1, y);
			dfs(x, y+1);
			
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i < n; i++) {
			String words = scan.nextLine();
			
			for(int j=0; j < m; j++) {
				array[i][j] = Character.getNumericValue(words.charAt(j));
			}
		}
		
		int cnt = 0;
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				if(dfs(i, j)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
