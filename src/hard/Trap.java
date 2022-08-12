package hard;

public class Trap {
	
	private int count = 0;
	private int sumArea = 0;
	private int examSum = 0;
	private int maxValue = 0;
	private int maxValueIndex = 0;
	private int[] height;
	
	public int trap(int[] height) {
		this.height = height;
		setMaxValue();
		findSumLeftArea();
		findSumRightArea();
		return sumArea;
    }
	
	void setMaxValue() {
		for(int i = 0; i < height.length; i++) {
			maxValueIndex = (height[i] > maxValue) ? i : maxValueIndex;
			maxValue = (height[i] > maxValue) ? height[i] : maxValue;
		}
	}
	
	void findSumLeftArea() {
		for(int i = 0; i < maxValueIndex; i++) {
			examSum = 0;
			for(int j = i+1; j <= maxValueIndex; j++) {
				count = j;
				if(height[i] <= height[j]) 
					break;
				examSum += (height[i]-height[j]);
			}
			i = count-1;
			sumArea += examSum;
		}
	}
	
	void findSumRightArea() {
		for(int i = height.length-1; i > maxValueIndex; i--) {
			examSum = 0;
			for(int j = i-1; j >= maxValueIndex; j--) {
				count = j;
				if(height[i] <= height[j]) 
					break;
				examSum += (height[i]-height[j]);
			}
			i = count+1;
			sumArea += examSum;
		}
	}
}
