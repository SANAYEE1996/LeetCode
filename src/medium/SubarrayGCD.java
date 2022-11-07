package medium;

import java.util.ArrayList;

public class SubarrayGCD {
	public int subarrayGCD(int[] nums, int k) {
		int answer = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] % k == 0) {
        		ArrayList<Integer> multipleList = new ArrayList<>();
        		for(; i < nums.length; i++) {
        			if(nums[i] % k != 0) {
        				break;
        			}
        			multipleList.add(nums[i]/k);
        		}
        		answer += getCaseCount(multipleList);
//        		System.out.println("multipleList : " +multipleList);
//        		System.out.println("is answer ? : " +answer);
        	}
        }
//		System.out.println("last answer : " +answer);
		return answer;
    }
	
	private int getCaseCount(ArrayList<Integer> list) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 1) {
				count += list.size();
			}
		}
		return count;
	}
}
