package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3023 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int height = 2*R;
		int width = 2*C;
		
		char[][] arr = new char[height][width];
		
		for(int i=0; i<R; i++) {
			String input = br.readLine();
			for(int j=0; j<C; j++) {
				char c = input.charAt(j);
				arr[i][j] = c;
				arr[i][width-j-1] = c; 
			}
		}
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				arr[i][width-j-1] = arr[i][j]; 
			}
		}
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<width; j++) {
				arr[height-i-1][j] = arr[i][j]; 
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		if(arr[A-1][B-1] == '.') {
			arr[A-1][B-1] = '#';
		} else {
			arr[A-1][B-1] = '.';
		}
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
