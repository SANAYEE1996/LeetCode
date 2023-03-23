package medium;

public class XorBeauty {
	public int xorBeauty(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum = sum^i;
        }
        return sum;
    }
}
