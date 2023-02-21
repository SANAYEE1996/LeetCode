package medium;

public class MinPartitions {
	public int minPartitions(String n) {
		int max = 0;
		for(int i = 0; i < n.length(); i++) {
			max = Math.max(max, (int)n.charAt(i)-48);
		}
        return max;
    }
}
