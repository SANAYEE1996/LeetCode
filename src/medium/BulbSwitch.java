package medium;

public class BulbSwitch {
	public int bulbSwitch(int n) {
		int value = 3;
		int min = 1;
		int max = min + value - 1;
		int answer = 1;
		while(true){
			if(min <= n && n <= max){
				break;
			}
			answer++;
			min += value;
			value += 2;
			max = min + value - 1;
		}
		return answer;
	}	
}
