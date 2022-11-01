package medium;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		int sumProductValue = 1;
		int beforeSumProductValue;
		int beforeMinusOrZero = -11;
		
		for(int i : nums) {
			if(i > 0) {
				sumProductValue *= i;
			}
			else if(i == 0) {
				System.out.println("패치 중");
			}
			else {
				if(sumProductValue < 0) {
					sumProductValue *= i;
				}
				else if(sumProductValue == 0) {
					System.out.println("패치 중");
				}
				else {
					if(beforeMinusOrZero != -11) {
						
					}
					
					beforeSumProductValue = sumProductValue;
					beforeMinusOrZero = i;
					sumProductValue = 1;
				}
			}
		}
		
		System.out.println("sum Product : " +sumProductValue);
		
		return 0;
    }
}
