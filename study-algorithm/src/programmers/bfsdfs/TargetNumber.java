package programmers.bfsdfs;

public class TargetNumber {
	static int answer = 0;
	static int target = 3;
	static int[] numbers = new int[] {1,1,1,1,1}; 
	
	public static void main(String[] args) {
		dfs(numbers, target, 0);
		System.out.println(answer);
	}
	
	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0);
		
		return answer;
	}
	
	public static void dfs(int[] numbers, int target, int idx) {
		
		if(idx == numbers.length) {
			int sum = 0;
			
			for(int number : numbers) {
				sum += number;
			}
			
			if(sum == target) {
				answer++;
			}
		} else {
			numbers[idx] *= 1;
			dfs(numbers, target, idx++);
			
			numbers[idx] *= -1;
			dfs(numbers, target, idx++);
		}

	}
}
 