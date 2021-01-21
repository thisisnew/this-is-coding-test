package Ch05;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
	
	static boolean[] visited = new boolean[9];
	static List<List<Integer>> list = new ArrayList<List<Integer>>();
	
	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
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
		
		list.get(7).add(6);
		list.get(7).add(8);
		
		list.get(8).add(1);
		list.get(8).add(7);
		
		dfs(1);
	}
	
	private static void dfs(int number) {
		
		visited[number] = true;
		
		System.out.print(number + "\t");
		
		List<Integer> nodes = list.get(number);
		
		for(int node : nodes) {
			if(!visited[node]) {
				dfs(node);
			}
		}
		
		
	}
}
