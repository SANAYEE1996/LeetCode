package medium;

public class ComputeArea {
	public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int xOverLap = getOverlapLength(ax1, ax2, bx1, bx2);
        int yOverLap = getOverlapLength(ay1, ay2, by1, by2);
        int xArea = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int yArea = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
		return xArea + yArea - xOverLap*yOverLap;
    }
	
	private int getOverlapLength(int ax1, int ax2, int bx1, int bx2){
		int axMin = Math.min(ax1, ax2);
		int axMax = Math.max(ax1, ax2);
		
		int bxMin = Math.min(bx1, bx2);
		int bxMax = Math.max(bx1, bx2);
		
		if(axMin <= bxMin && bxMin <= axMax) {
			return axMax - bxMin;
		}
		else if(axMin <= bxMax && bxMax <= axMax) {
			return bxMax - axMin;
		}
		return 0;
	}
}
