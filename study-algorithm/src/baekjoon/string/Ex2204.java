package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2204 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				break;
			}
			
			List<String> list = new ArrayList<String>();
			
			for(int i=0; i<input; i++) {
				String s = br.readLine();
				list.add(s);
			}
			
			Collections.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase());
				}
			});
			
			System.out.println(list.get(0));
			
		}
	}
}
