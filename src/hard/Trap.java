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
		for(int i = 0; i < height.length; i++) {
			examSum = 0;
			for(int j = i+1; j < height.length; j++) {
				count = j;
				if(height[i] <= height[j]) 
					break;
				examSum += (height[i]-height[j]);
				if(j == height.length-1)
					examSum = 0;
				System.out.println(examSum);
			}
			i = count;
			System.out.println("i value : " +i +" exam Sum : " +examSum);
			sumArea += examSum;
		}
		
		return sumArea;
    }
}
