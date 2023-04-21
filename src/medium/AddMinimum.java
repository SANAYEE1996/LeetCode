package medium;

import java.util.ArrayList;

public class AddMinimum {
	public int addMinimum(String word) {
		ArrayList<String> list = new ArrayList<>();
		
		char beforeChar = word.charAt(0);
		int differ = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(beforeChar);
		for(int i = 1; i < word.length(); i++){
			differ = word.charAt(i) - beforeChar;
			if(differ == 1 || differ == 2){
				sb.append(word.charAt(i));
				beforeChar = word.charAt(i);
				continue;
			}
			list.add(sb.toString());
			sb.setLength(0);
			sb.append(word.charAt(i));
			beforeChar = word.charAt(i);
		}
		list.add(sb.toString());
		System.out.println(list);
		int answer = 0;
		for(String s : list){
			if(s.equals("")){
				continue;
			}
			answer += (3-s.length());
		}
		return answer;
	}
}
