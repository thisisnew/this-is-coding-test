package Ch07;

public class SequentialSearch {
	
	public static void main(String[] args) {		
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f", "g"};
		String target = "c";
		
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(target.equals(arr[i])) {
				index = i + 1;
				break;
			}
		}
		
		System.out.println(index);
	}
}
