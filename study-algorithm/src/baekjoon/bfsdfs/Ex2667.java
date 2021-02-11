package baekjoon.bfsdfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2667 {
	
	static int n;
	static int cnt;
	static int[][] array = new int[26][26];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static boolean dfs(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		
		if(array[x][y] == 1) {
			cnt++;
			array[x][y] = 0;
			
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0; i<n; i++) {
			String words = scanner.nextLine();
			
			for(int j=0; j<n; j++) {
				array[i][j] = Character.getNumericValue(words.charAt(j));
			}
		}
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(dfs(i, j)) {
					list.add(cnt);
					cnt = 0;
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int i : list) {
			System.out.println(i);
		}
	}
}
