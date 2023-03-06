package medium;

public class ColoredCells {
	public long coloredCells(int n) {
        return (long)n*2-(long)1 +(long)Math.pow(n-1,2)*2;
    }
}
