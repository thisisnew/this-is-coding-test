package programmers.bfsdfs;

public class Network {
	
	static int answer = 0;
	static boolean[] isVisited;
	
	public static void main(String[] args) {
		int[][] computers = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
		int n = 3;
		
		System.out.println(solution(n, computers));
	}
	
	public static int solution(int n, int[][] computers) {
		
		isVisited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(dfs(i, j, n, computers)) {
					answer++;
				}
			}
		}
		
        return answer;
    }
	
	static boolean dfs(int x, int y, int n, int[][] computers) {
		
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		
		if(computers[x][y] == 1) {
			computers[x][y] = 0;
			
			dfs(x-1, y, n, computers);
			dfs(x+1, y, n, computers);
			dfs(x, y-1, n, computers);
			dfs(x, y+1, n, computers);
			
			return true;
		}
		
		return false;
	}
	
}
