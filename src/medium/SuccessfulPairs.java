package medium;

import java.util.Arrays;

public class SuccessfulPairs {
	public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] answer = new int[spells.length];
        
        Arrays.sort(potions);
        long target = 0;
        int index = 0;
        for(int i = 0; i < spells.length; i++) {
        	target = (success / (long) spells[i]);
        	target = (success % (long) spells[i] == 0) ? target : target+1;
        	index = getbinaryIndex(potions, target);
        	System.out.println("target : " +target + " and index : " +index);
        	if((long)potions[index] <= target) {
        		answer[i] = potions.length - index + 1;
        	}
        	else {
        		answer[i] = potions.length - index;
        	}
        }
        
        return answer;
    }
	
	private int getbinaryIndex(int[] nums, long target) {
		int low = 0;
		int high = nums.length-1;
		int middle = (low+high)/2;
		while(low <= high) {
			if((long)nums[middle] == target) {
				return middle;
			}
			else if(target < (long)nums[middle]) {
				high = middle-1;
				middle = (low+high)/2;
			}
			else if((long)nums[middle] < target) {
				low = middle+1;
				middle = (low+high)/2;
			}
		}
		return middle;
	}
	
	public static void main(String[] args) {
		SuccessfulPairs s= new SuccessfulPairs();
		int[] spells = {5,1,3};
		int[] potions = {1,2,3,4,5};
		System.out.println(Arrays.toString(s.successfulPairs(spells, potions, 7)));
		
		spells = new int[] {3,1,2};
		potions = new int[] {8,5,8};
		System.out.println(Arrays.toString(s.successfulPairs(spells, potions, 16)));
	}
}
