package hard;

public class Trap {
	
	/*
	 * [0,1,0,2,1,0,1,3,2,1,2,1]
	 * 
	 * */
	public int trap(int[] height) {
		int backTop = 0;
		for(int i = 0; i < height.length; i++) {
			if(backTop < height[i]) backTop = height[i];
			System.out.println( "나의 인덱스 : "+i+
								" // 나의 값 : "+height[i]+
								" // 큰 놈 : " +backTop);
		}
		
		return 0;
    }
}
