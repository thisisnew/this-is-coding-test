package ch13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex15 {
	 
	static int n, m, k, x;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int[] distance = new int[300001];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		k = scan.nextInt();
		x = scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
			distance[i] = -1;
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.get(a).add(b);
		}
		
		distance[x] = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int i=0; i<list.get(now).size(); i++) {
				int next = list.get(now).get(i);
				
				if(distance[next] == -1) {
					distance[next] = distance[now] + 1;
					q.offer(next);
				}
			}
		}
		
		int result = -1;
		
		for(int i=1; i<=n; i++) {
			if(distance[i] == k) {
				result = i;
				System.out.println(result);
			}
		}
	}
}
