package ch05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex9 {
	
	public static boolean[] isVisited = new boolean[9];
	public static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	public static void bfs(int number) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(number);
		
		isVisited[number] = true;
				
		while(!q.isEmpty()) {
			int x = q.poll();
			
			System.out.print(x + " ");
			
			List<Integer> temp = list.get(x);
			
			for(int v : temp) {
				if(!isVisited[v]) {
					q.offer(v);
					isVisited[v] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i <= 8; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		list.get(1).add(2);
		list.get(1).add(3);
		list.get(1).add(8);
		
		list.get(2).add(1);
		list.get(2).add(7);
		
		list.get(3).add(1);
		list.get(3).add(4);
		list.get(3).add(5);
		
		list.get(4).add(3);
		list.get(4).add(5);
		
		list.get(5).add(3);
		list.get(5).add(4);
		
		list.get(6).add(7);
		
		list.get(7).add(2);
		list.get(7).add(6);
		list.get(7).add(8);
		
		list.get(8).add(1);
		list.get(8).add(7);
		
		bfs(1);
	}
}
