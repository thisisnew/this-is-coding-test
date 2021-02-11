package baekjoon.bfsdfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2606 {
	
	static int n;
	static int m;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int answer;
	static boolean[] isVisted;
	
	public static void dfs(int x) {
		isVisted[x] = true;
		
		for(int i=0; i < list.get(x).size(); i++) {
			int n = list.get(x).get(i);
			
			if(!isVisted[n]) {
				answer++;
				dfs(n);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		scanner.nextLine();
		
		isVisted = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		String str;
		int a;
		int b;
		for(int i = 0; i < m; i++) {
			str = scanner.nextLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		answer = 0;
		dfs(1);
		
		System.out.println(answer);
	}
}
