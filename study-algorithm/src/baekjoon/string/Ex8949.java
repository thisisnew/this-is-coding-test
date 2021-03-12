package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex8949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken(); 
		String B = st.nextToken();
		
		Stack<Integer> aStack = new Stack<Integer>();
		Stack<Integer> bStack = new Stack<Integer>();
		
		for(int i=0; i<A.length(); i++) {
			aStack.push(A.charAt(i) - '0');
		}
		
		for(int i=0; i<B.length(); i++) {
			bStack.push(B.charAt(i) - '0');
		}
		
		List<Integer> list = new ArrayList<Integer>();
	
		while(aStack.size() >0 && bStack.size() >0) {
			list.add(aStack.pop() + bStack.pop());
		}
		
		while(aStack.size() > 0) {
			list.add(aStack.pop());
		}
		
		while(bStack.size() > 0) {
			list.add(bStack.pop());
		}
		
		String answer = "";
		
		for(int i=list.size()-1; i>=0; i--) {
			answer += String.valueOf(list.get(i));
		}
		
		System.out.println(answer);
	}
}
