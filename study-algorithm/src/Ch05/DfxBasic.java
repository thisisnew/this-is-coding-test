package Ch05;

import java.util.ArrayList;
import java.util.List;

public class DfxBasic {

	static List<List<Integer>> list = new ArrayList<List<Integer>>();
	static boolean[] isVisited = new boolean[8]; 
	
	public static void main(String[] args) {
		
		for(int i=0; i<8; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		list.get(1).add(2);
		list.get(1).add(3);
		
		list.get(2).add(4);
		list.get(2).add(5);
		
		list.get(3).add(1);
		list.get(3).add(7);
		
		list.get(4).add(2);
		list.get(4).add(6);
		
		list.get(5).add(2);
		list.get(5).add(6);
		
		list.get(6).add(4);
		list.get(6).add(5);
		list.get(6).add(7);
		
		list.get(7).add(3);
		list.get(7).add(6);
		
		dfs(1);

	}
	
	
	private static void dfs(int num) {
		isVisited[num] = true;
		
		System.out.print(num + " ");
		
		List<Integer> nodes = list.get(num);
		
		for(int node : nodes) {
			if(!isVisited[node]) {
				dfs(node);
			}
		}
	}
}
