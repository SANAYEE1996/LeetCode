package medium;

import java.util.ArrayList;

public class MinFlipsMonoIncr {
	public int minFlipsMonoIncr(String s) {
		System.out.println("input : " +s);
		ArrayList<Integer> zeroIndexList = new ArrayList<>();   
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				zeroIndexList.add(i-1);
				break;
			}
		}
		if(!zeroIndexList.isEmpty()){
			for(int i = zeroIndexList.get(0)+1; i < s.length(); i++){
				if(s.charAt(i) == '0'){
					zeroIndexList.add(i);
				}
			}
			int zeroDifferValue = 0;
			for(int i = 1; i < zeroIndexList.size(); i++){
				zeroDifferValue += (zeroIndexList.get(i)-zeroIndexList.get(i-1)-1);
			}
			System.out.println("zeroDifferValue : " +zeroDifferValue);
			System.out.println("list : " +zeroIndexList);
			return Math.min(zeroDifferValue, zeroIndexList.size()-1);
		}
		return 0;
	}
}
