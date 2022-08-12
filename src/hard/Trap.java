package hard;

public class Trap {
	
	/*
	 * [0,1,0,2,1,0,1,3,2,1,2,1]
	 * 
	 * */
	public int trap(int[] height) {
		int count = 0;
		int sumArea = 0;
		int examSum = 0;
		int maxValue = 0;
		int maxValueIndex = 0;
		for(int i = 0; i < height.length; i++) {
			if(height[i] > maxValue) {
				maxValue = height[i];
				maxValueIndex = i;
			}
		}
		
		for(int i = 0; i < maxValueIndex; i++) {
			examSum = 0;
			for(int j = i+1; j <= maxValueIndex; j++) {
				count = j;
				if(height[i] <= height[j]) 
					break;
				examSum += (height[i]-height[j]);
				//System.out.println(examSum + " " +(height[i]-height[j]));
			}
			//System.out.println("i value : " +i +" exam Sum : " +examSum);
			i = count-1;
			sumArea += examSum;
		}
		for(int i = height.length-1; i > maxValueIndex; i--) {
			examSum = 0;
			for(int j = i-1; j >= maxValueIndex; j--) {
				count = j;
				if(height[i] <= height[j]) 
					break;
				examSum += (height[i]-height[j]);
			}
			//System.out.println("i value : " +i +" exam Sum : " +examSum);
			i = count+1;
			sumArea += examSum;
		}
		//System.out.println("the answer is : "+sumArea + " // time complexiblity : " +time);
		return sumArea;
    }
}
