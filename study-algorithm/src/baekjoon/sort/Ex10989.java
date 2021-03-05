package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[10001];
		
		for (int i = 0; i < N; i++) {
			array[Integer.parseInt(br.readLine())] ++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 0은 입력범위에서 없으므로 1부터 시작
		for(int i = 1; i < 10001; i++){
			// i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
			while(array[i] > 0){
				sb.append(i).append("\n");
				array[i]--;
			}
		}
		
		System.out.println(sb);
	}
}
