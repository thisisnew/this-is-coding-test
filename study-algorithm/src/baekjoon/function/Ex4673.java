package baekjoon.function;

public class Ex4673 {
	public static void main(String[] args) {
		boolean[] isSelfNumber = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int sum = i;
			String s = String.valueOf(i);
			for(int j=0; j<s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			
			if(sum <= 10000) {
				isSelfNumber[sum] = true;
			}
		}
		
		for(int i=1; i<isSelfNumber.length; i++) {
			if(!isSelfNumber[i]) {
				System.out.println(i);
			}
		}
	}
}
