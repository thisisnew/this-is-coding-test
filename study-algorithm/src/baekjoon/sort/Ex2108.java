package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex2108 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] countArray = new int[8001];
		int average = 0;
		int median = 0;
		int mode = 0;
		int bound = 0;
		int sum = 0;
		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			int v = Integer.parseInt(br.readLine());
			sum += v;
			countArray[v + 4000]++;
			array[i] = v;
		}
		
		//  ArrayList를 사용해 여러 개의 최빈값을 저장 
        int maxIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<8001 ; i++){
            if(countArray[maxIndex] < countArray[i]){
                maxIndex = i;
                list.clear();
            }
            else if(countArray[i]!=0 && countArray[i] == countArray[maxIndex]){
                list.add(i-4000);
            }
        }
        
        if(list.size() > 0) {
        	mode = list.get(0);
        } else {
        	mode = maxIndex - 4000;
        }
        
        Arrays.sort(array);
		
		average = (int)Math.round((double)sum/N);
		median = array[N/2];
		bound = array[N-1] - array[0];
		
		System.out.println(average);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(bound);
	}
}
