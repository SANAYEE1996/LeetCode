package medium;

public class AddMinimum {
	public int addMinimum(String word) {
		
		char beforeChar = word.charAt(0);
		int differ = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(beforeChar);
		int answer = 0;
		String part = "";
		for(int i = 1; i < word.length(); i++){
			differ = word.charAt(i) - beforeChar;
			if(differ == 1 || differ == 2){
				sb.append(word.charAt(i));
				beforeChar = word.charAt(i);
				continue;
			}
			part = sb.toString();
			if(!part.equals("")) {
				answer += (3-part.length());
			}
			sb.setLength(0);
			sb.append(word.charAt(i));
			beforeChar = word.charAt(i);
		}
		part = sb.toString();
		if(!part.equals("")) {
			answer += (3-part.length());
		}
		
		return answer;
	}
}
