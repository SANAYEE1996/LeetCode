package medium;

import java.util.Arrays;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int nowReach = 0;
		int maxReach = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nowReach = nums[i];
			maxReach = Math.max(nowReach, maxReach);
			if(maxReach == 0 && i < nums.length-1) {
				return false;
			}
			maxReach--;
		}
		return true;
    }
	
	/*
	 * 2,3,5,1,4,0,0,1,1
	 * */
	
	
	public int jump(int[] nums) {
		System.out.println("들어온 배열 : " +Arrays.toString(nums));
		int nowReach = 0;
		int maxReach = 0;
		
		int answer = 0;
		for(int i = 0; i < nums.length; i++) {
			answer++;
			nowReach = i + nums[i];
			maxReach = Math.max(nowReach, maxReach + nums[maxReach]);
			System.out.println("index : "+i+" 가 현재 닿는 곳 : " +nowReach + " 일단 제일 최대로 멀리 가는 곳  : " +maxReach);
			if(maxReach >= nums.length-1) {
				break;
			}
		}
		if(maxReach < nums.length-1) {
			return 0;
		}
		
		
		return answer;
    }
}
