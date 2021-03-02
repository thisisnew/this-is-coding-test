package baekjoon.ifstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex2884 {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		/*
		 * 풀이1
		 * Calendar calendar = Calendar.getInstance();
		 * calendar.set(Calendar.HOUR_OF_DAY, H); calendar.set(Calendar.MINUTE, M);
		 * calendar.add(Calendar.MINUTE, -45);
		 * 
		 * System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " +
		 * calendar.get(Calendar.MINUTE));
		 */
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
		
	}
}
