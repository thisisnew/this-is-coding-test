package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3035 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());
        
        char[][] array = new char[R][C];
        
        for(int i=0; i<R; i++) {
        	String input = br.readLine();
        	
        	for(int j=0; j<C; j++) {
        		array[i][j] = input.charAt(j);
        	}
        }
        
        for(int i=0; i<R; i++) {
        	for(int t=0; t<ZR; t++) {
        		for(int j=0; j<C; j++) {
            		for(int k=0; k<ZC; k++) {
            			System.out.print(array[i][j]);
                	}
            	}
            	System.out.println();
        	}
        }
	}
}
