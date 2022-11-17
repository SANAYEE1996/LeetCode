package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
	public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> answerList = new ArrayList<>();
        int minAppearCount = nums.length/3;
        int appearCount = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                appearCount++;
                continue;
            }
            if(appearCount > minAppearCount){
                answerList.add(nums[i]);
            }
            appearCount = 1;
        }
        if(appearCount > minAppearCount){
            answerList.add(nums[nums.length-1]);
        }

        return answerList;
    }
}
