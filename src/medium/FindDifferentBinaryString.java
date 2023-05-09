package medium;

import java.util.HashSet;

public class FindDifferentBinaryString {
	public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(String s : nums){
            set.add(Integer.parseInt(s, 2));
        }
        String answer = "";
        for(int i = 0; i <= (int)Math.pow(2, nums.length); i++){
            if(!set.contains(i)){
                answer = Integer.toBinaryString(i);
                break;
            }
        }
        if(answer.length() == nums.length){
            return answer;
        }
        return attachZero(answer, nums.length);
    }
    
    private String attachZero(String s, int length){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(sb.toString().length() != length){
            sb.insert(0,"0");
        }
        return sb.toString();
    }
}
