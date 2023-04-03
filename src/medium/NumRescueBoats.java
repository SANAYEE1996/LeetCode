package medium;

import java.util.Arrays;

public class NumRescueBoats {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);

		int low = 0;
		int high = people.length-1;
		int value = 0;
		int answer = 0;

		while(low <= high){
			value = (low == high) ? people[low] : people[low] + people[high];
			if(value <= limit){
				low++;
				high--;
				answer++;
			}
			else{
				high--;
				answer++;
			}
		}

		return answer == 0 ? 1 : answer;
    }
}
