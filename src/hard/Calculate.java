package hard;

public class Calculate {
	
	/**
	 * https://leetcode.com/problems/basic-calculator/
	 * 
	 * */
	
	private String s;
	private int i;

	public int calculate(String s) {
		int answer = 0;
		char mark = '+';
		this.s = s;
		i = 0;
		for(; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '('){
				int value = Character.isDigit(s.charAt(i)) ? getInteger() : gogo();
				answer = (mark == '+') ? answer + value : answer - value;
				continue;
			}
			else if(s.charAt(i) == ' ') continue;
			mark = s.charAt(i);
		}
		return answer;
	}

	private int getInteger(){
		StringBuilder sb = new StringBuilder();
		for(; i < s.length(); i++){
			if(!Character.isDigit(s.charAt(i))) {i--; break;}
			sb.append(s.charAt(i));
		}
		return Integer.parseInt(sb.toString());
	}

	private int gogo(){
		i++;
		char mark = '+';
		int part = 0;
		for(; i < s.length(); i++){
			if(s.charAt(i) == ')'){
				break;
			}
			else if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '('){
				int value = Character.isDigit(s.charAt(i)) ? getInteger() : gogo();
				part = (mark == '+') ? part + value : part - value;
				continue;
			}
			else if(s.charAt(i) == ' ') continue;
			mark = s.charAt(i);
		}
		return part;
	}
}
