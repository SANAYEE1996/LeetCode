package easy;

public class ArraySign {
	public int arraySign(int[] nums) {
        int status = 1;
        for(int i : nums){
            status *= i;
            status = status >= 0 ? (status == 0 ? 0 : 1) : -1;
        }
        return status;
    }
}
