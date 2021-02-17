package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11586 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		String[] copyArr;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		int k = Integer.parseInt(br.readLine());
		
		if(k == 1) {
			for(String value : arr) {
				System.out.println(value);
			}
		} else if(k == 2) {
			for(int j=0; j<arr.length; j++) {
				String el = arr[j]; 
				String value = "";
				
				for(int i=el.length()-1; i>=0; i--) {
					value += el.charAt(i); 
				}
				
				arr[j] = value;
			}
			
			for(String value : arr) {
				System.out.println(value);
			}
		} else {
			for(int i=arr.length-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
