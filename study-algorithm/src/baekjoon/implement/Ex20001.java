package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Queue;

public class Ex20001 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		while(true) {
			
			if(input.equals("문제")) {
				q.offer(1);
			}
			
			if(input.equals("고무오리")) {
				if(q.isEmpty()) {
					q.offer(1);
					q.offer(1);
				} else {
					q.poll();
				}
			}
			
			input = br.readLine();
			
			if(input.equals("고무오리 디버깅 끝")) {
				break;
			}
		}
		
		
		if(q.isEmpty()) {
			System.out.println("고무오리야 사랑해");
		} else {
			System.out.println("힝구");
		}
		
	}
}
