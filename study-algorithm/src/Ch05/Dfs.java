package Ch05;

import java.util.Scanner;

public class Dfs {
	
	static int n, m;
	static int[][] array = new int[1000][1000];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String words = sc.nextLine();
			
			for(int j=0; j<m; j++) {
				array[i][j] = Character.getNumericValue(words.charAt(j));
			}
		}
		
		int result = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i, j)) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		if(array[x][y] == 0) {
			array[x][y] = 1;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			
			return true;
		}
		
		
		return false;
	}
	
}
