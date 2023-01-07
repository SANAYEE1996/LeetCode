package medium;

public class CanCompleteCircuit {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		
		int[] gasArray = new int[gas.length];
		for(int i = 0; i < gasArray.length; i++) {
			gasArray[i] = gas[i] - cost[i];
		}
		int answer = -1;
		int sum = 0;
		boolean isFirstOverZero = true;
		for(int i = 0; i < gasArray.length; i++) {
			sum += gasArray[i];
			if(sum < 0) {
				sum = 0;
				answer = -1;
				isFirstOverZero = true;
			}
			else {
				if(isFirstOverZero) {
					isFirstOverZero = false;
					answer = i;
				}
			}
		}
		for(int i = 0; i <= answer-1; i++) {
			sum += gasArray[i];
			if(sum < 0) {
				answer = -1;
				break;
			}
		}
        return answer;
    }
}
