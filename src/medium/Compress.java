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
				sb.append(duplicateCount);
			}
			answer += duplicateCount == 1 ? 0 : String.valueOf(duplicateCount).length();
			duplicateCount = 1;
			beforeChar = nowChar;
		}
		answer++;
		answer += duplicateCount == 1 ? 0 : String.valueOf(duplicateCount).length();
		if(nowChar == '0') {
			sb.append(beforeChar);
		}else {
			sb.append(nowChar);
			sb.append(duplicateCount);
		}
		String answerString = sb.toString();
		for(int i = 0; i < answer; i++) {
			chars[i] = answerString.charAt(i);
		}
		return answer;
	}
	
}
