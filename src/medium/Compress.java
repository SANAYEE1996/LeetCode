package medium;

import java.util.ArrayList;
import java.util.Arrays;

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
			charList.add(beforeChar);
			countList.add(duplicateCount);
			answer += duplicateCount == 1 ? 0 : getSizeFromInteger(duplicateCount);
			duplicateCount = 1;
			beforeChar = nowChar;
		}
		answer++;
		answer += duplicateCount == 1 ? 0 : getSizeFromInteger(duplicateCount);
		charList.add(nowChar == '0' ? beforeChar : nowChar);
		countList.add(duplicateCount);
		System.out.println(charList);
		System.out.println(countList);
		chars = new char[answer];
		int value = 0;
		int listIndex = 0;
		for(int i = 0; i < chars.length; i++) {
			chars[i] = charList.get(listIndex);
			value = countList.get(listIndex);
			if(value == 1) {continue;}
			char[] exam = intToCharArray(value);
			int index = 0;
			i++;
			for(; i < chars.length; i++) {
				if(index == exam.length) {break;}
				chars[i] = exam[index];
				index++;
			}
			listIndex++;
		}
		System.out.println(Arrays.toString(chars));
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
	
	private char[] intToCharArray(int num) {
		int size = getSizeFromInteger(num);
		char[] charArray = new char[size];
		int index = 0;
		size--;
		int value = 0;
		while(size >= 0) {
			value = num/(int)Math.pow(10, size);
			charArray[index] = (char) (value+48);
			num -= value * (int)Math.pow(10, size);
			size--;
			index++;
		}
		return charArray;
	}
	
}
