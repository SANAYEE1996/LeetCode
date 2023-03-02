package medium;

public class Compress {
	public int compress(char[] chars) {
		int answer = 0;
		char beforeChar = chars[0];
		char nowChar = '0';
		int duplicateCount = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < chars.length; i++){
			nowChar = chars[i];
			if(beforeChar == nowChar){
				duplicateCount++;
				continue;
			}
			answer++;
			sb.append(beforeChar);
			if(duplicateCount > 1) {
				putIntegerToStringBuilder(duplicateCount, sb);
			}
			answer += duplicateCount == 1 ? 0 : getSizeFromInteger(duplicateCount);
			duplicateCount = 1;
			beforeChar = nowChar;
		}
		answer++;
		answer += duplicateCount == 1 ? 0 : getSizeFromInteger(duplicateCount);
		if(nowChar == '0') {
			sb.append(beforeChar);
		}else {
			sb.append(nowChar);
			if(duplicateCount > 1) {
				putIntegerToStringBuilder(duplicateCount, sb);
			}
		}
		String answerString = sb.toString();
		for(int i = 0; i < answer; i++) {
			chars[i] = answerString.charAt(i);
		}
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
	
	private void putIntegerToStringBuilder(int num, StringBuilder sb) {
		int size = getSizeFromInteger(num);
		size--;
		int value = 0;
		while(size >= 0) {
			value = num/(int)Math.pow(10, size);
			sb.append((char) (value+48));
			num -= value * (int)Math.pow(10, size);
			size--;
		}
	}
	
}
