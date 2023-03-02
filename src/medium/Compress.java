package medium;

import java.util.ArrayList;

public class Compress {
	public int compress(char[] chars) {
		int answer = 0;
		char beforeChar = chars[0];
		char nowChar = '0';
		int duplicateCount = 1;
		ArrayList<Character> charList = new ArrayList<>();
		ArrayList<Integer> countList = new ArrayList<>();
		for(int i = 1; i < chars.length; i++){
			nowChar = chars[i];
			if(beforeChar == nowChar){
				duplicateCount++;
				continue;
			}
			answer++;
			answer += getSizeFromInteger(duplicateCount);
			charList.add(beforeChar);
			countList.add(duplicateCount);
			duplicateCount = 1;
			beforeChar = nowChar;
		}
		answer++;
		answer += getSizeFromInteger(duplicateCount);
		charList.add(nowChar);
		countList.add(duplicateCount);
		System.out.println(charList);
		System.out.println(countList);
		return answer;
	}

	private int getSizeFromInteger(int num){
		int size = 0;
		while(num != 0){
			size++;
			num /= 10;
		}
		return size;
	}
}
