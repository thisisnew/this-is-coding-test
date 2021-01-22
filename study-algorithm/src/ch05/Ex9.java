package ch05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex9 {
	
	static List<List<Integer>> list = new ArrayList<List<Integer>>();
	static boolean[] isVisited = new boolean[9];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
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
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		isVisited[start] = true;
		
		while(!queue.isEmpty()) {
			
			int num = queue.remove();
			System.out.print(num + " ");
			
			List<Integer> nodes = list.get(num);
			
			for(int node : nodes) {
				if(!isVisited[node]) {
					queue.add(node);
					isVisited[node] = true;
				}
			}
			
		}
		
	}
	
}
