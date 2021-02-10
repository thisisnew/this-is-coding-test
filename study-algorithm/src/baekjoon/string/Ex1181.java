package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		
		Iterator<String> itor = set.iterator();
		
		String[] arr = new String[set.size()];
		
		int i = 0;
		while(itor.hasNext()) {
			arr[i] = itor.next();
			i++;
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
