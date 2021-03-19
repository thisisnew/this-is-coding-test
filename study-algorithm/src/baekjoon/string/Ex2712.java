package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double d = Double.parseDouble(st.nextToken());
			
			String op = st.nextToken();
			
			if(op.equals("kg")) {
				d = 2.2046 * d;
				System.out.println(String.format("%.4f", d) + " lb");
			}
			
			if(op.equals("l")) {
				d = 0.2642 * d;
				System.out.println(String.format("%.4f", d) + " g");
			}
			
			if(op.equals("lb")) {
				d = 0.4536 * d;
				System.out.println(String.format("%.4f", d) + " kg");
			}
			
			if(op.equals("g")) {
				d = 3.7854 * d;
				System.out.println(String.format("%.4f", d) + " l");
			}
		}
		
	}
}
