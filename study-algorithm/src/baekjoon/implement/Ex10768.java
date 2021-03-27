package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Ex10768 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LocalDateTime ccc = LocalDateTime.of(2015, 2, 18, 0, 0);
		
		int month = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());
		
		LocalDateTime time = LocalDateTime.of(2015, month, day, 0, 0);
		
		if(time.isBefore(ccc)) {
			System.out.println("Before");
		}
		
		if(time.isAfter(ccc)) {
			System.out.println("After");
		}
		
		if(time.isEqual(ccc)) {
			System.out.println("Special");
		}
	}
}
