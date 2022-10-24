package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		System.out.println("input : " +Arrays.toString(nums));
        int beforeValue = Integer.MAX_VALUE;
        int sumCount = 0;
        int sameCount = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == beforeValue && sameCount < 1){
                sameCount++;
                sumCount++;
                beforeValue = nums[i];
                list.add(nums[i]);
                continue;
            }
            else if(nums[i] == beforeValue && sameCount >= 1){
            	beforeValue = nums[i];
                continue;
            }
            list.add(nums[i]);
            sumCount++;
            sameCount = 0;
            beforeValue = nums[i];
        }
        nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++) {
        	nums[i] = list.get(i);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(nums));
        return sumCount;
    }
}
