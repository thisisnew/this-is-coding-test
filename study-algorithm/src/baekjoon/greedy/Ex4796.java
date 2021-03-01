package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex4796 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if(L == 0 && P == 0 && V == 0) {
				break;
			}
			
			list.add(calc(L,P,V));
		}
		
		int cnt = 1;
		for(int result : list) {
			System.out.println("Case " + cnt + ": " + result);
			cnt++;
		}
		
	}
	
	static int calc(int L, int P, int V) {
		int sh = V / P;
		int rem = Math.min(L, V % P) ;
		
		return L * sh + rem;
	}
}
