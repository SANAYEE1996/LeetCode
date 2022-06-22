package medium;

public class MaxArea {
	public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
		int maxValue = 0;
		int value = 0;
		
		
		for(int i = 0; i < height.length; i++) {
			if(height[leftIndex] < height[rightIndex]) {
				if (height[rightIndex] < height[rightIndex - i]) {
					value  = (rightIndex - i - leftIndex) * height[rightIndex];
					if(value > maxValue) {
						maxValue = value;
						rightIndex -= i;
					}
				}
			}
			else if(height[leftIndex] > height[rightIndex]) {
				if (height[leftIndex] < height[leftIndex - i]) {
					value  = (leftIndex - i - rightIndex) * height[leftIndex];
					if(value > maxValue) {
						maxValue = value;
						leftIndex -= i;
					}
				}
			}			
		}
		
		
		
		return maxValue;
    }
}
