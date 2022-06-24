package medium;

public class MaxArea {
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftHeight = 0;
        int rightHeight = 0;
        int nowHeight = 0;
		int maxValue = 0;
		
		while(left != right) {
			rightHeight = height[right];
			leftHeight = height[left];
			nowHeight = Math.min(leftHeight , rightHeight);
			maxValue = Math.max(maxValue, nowHeight*(right-left));
			if(leftHeight <= rightHeight) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxValue;
    }
}
