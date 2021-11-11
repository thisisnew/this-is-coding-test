package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex2596 {
	static final Map<String, String> alphabetMap = new HashMap<String, String>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		alphabetMap.put("A", "000000");
		alphabetMap.put("B", "001111");
		alphabetMap.put("C", "010011");
		alphabetMap.put("D", "011100");
		alphabetMap.put("E", "100110");
		alphabetMap.put("F", "101001");
		alphabetMap.put("G", "110101");
		alphabetMap.put("H", "111010");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		String answer = "";
		for (int i = 0; i < t; i++) {

			String input = br.readLine();
			String word = "";
			int cnt = 0;
			for (int j = 0; j < input.length(); j++) {
				if (j > 0 && j % 6 == 0) {
					cnt++;
					String comp = compareAlphabet(word);
					if (comp.equals("ALL")) {
						answer = "";
						break;
					} else {
						word = "";
						answer += comp;
					}
				} else {
					word += input.charAt(j);
				}
			}
		
			if(answer.isBlank()) {
				System.out.println(cnt);
			} else {
				System.out.println(answer);
			}
		}
	}

	private static String compareAlphabet(String word) {
		String answer = "";
		maploop: 
			for (String key : alphabetMap.keySet()) {
			String value = alphabetMap.get(key);
			int cnt = 0;
			for (int i = 0; i < value.length(); i++) {
				if(value.charAt(i) != word.charAt(i)) {
					cnt++;
				}
				if(cnt == 2) {
					break maploop;
				}
			}
			
			if(cnt <= 1) {
				answer = value;
				break;
			}
		}
		
		if(answer.isBlank()) {
			answer = "ALL";
		}
		
		return answer;
	}

}
