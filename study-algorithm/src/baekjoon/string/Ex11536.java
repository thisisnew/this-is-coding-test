package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11536 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<String>();
		List<String> listComp = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			String input = br.readLine();

			list.add(input);
			listComp.add(input);
		}

		boolean isSame = true;
		Collections.sort(listComp);
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(listComp.get(i))) {
				isSame = false;
				break;
			}
		}

		if (isSame) {
			System.out.println("INCREASING");
		} else {
			isSame = true;

			Collections.sort(listComp, Collections.reverseOrder());

			for (int i = 0; i < list.size(); i++) {
				if (!list.get(i).equals(listComp.get(i))) {
					isSame = false;
					break;
				}
			}

			if (isSame) {
				System.out.println("DECREASING");
			} else {
				System.out.println("NEITHER");
			}
		}

	}
}
