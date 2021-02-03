package ch15;

public class ex04 {
    
	public int balancedIndex(String p) {
		int count = 0;
		
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				count++;
			} else {
				count--;
			}
			
			if(count == 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean checkProper(String u) {
		
		int count = 0;
		
		for(int i = 0; i < u.length(); i++) {
			
			if(u.charAt(i) == '(') {
				count++;
			} else {
				if(count == 0) {
					return false;
				}
				count--;
			}
		}
		
		return true;
	}
	
	public String solution(String p) {
        String answer = "";
        int index = balancedIndex(p);
        String u = p.substring(0, index + 1);
        String v = p.substring(index + 1);

        if (checkProper(u)) {
            answer = u + solution(v);
        } else { 
            answer = "(";
            answer += solution(v);
            answer += ")";
            
            u = u.substring(1, u.length() - 1); // 첫 번째와 마지막 문자를 제거
            String temp = "";
            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) == '(') {
                	temp += ")";
                } else {
                	temp += "(";
                }
            }
            answer += temp;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	ex04 ex = new ex04();
    	String result = ex.solution("(()())()");
    	
    	System.out.println(result);
	}
    
    
}
