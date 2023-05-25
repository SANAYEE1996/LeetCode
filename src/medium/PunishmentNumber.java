package medium;

public class PunishmentNumber {
	
	/**
	 * 
	 * https://leetcode.com/problems/find-the-punishment-number-of-an-integer/
	 * 
	 * Given a positive integer n, return the punishment number of n.
	 * 
	 * The decimal representation of i * i can be partitioned into contiguous substrings 
	 * such that the sum of the integer values of these substrings equals i.
	 * 
	 * 1 <= n <= 1000
	 * 
	 * */
	
	public int punishmentNumber(int n) {
		int answer = 0;
		boolean[] isRight = new boolean[1];
		for(int i = 1; i <= n; i++) {
			isRight[0] = false;
			gogo(String.valueOf(i*i), i, 0, 0, isRight);
			if(isRight[0]) {
				answer += i*i;
			}
		}
		return answer;
	}

	private void gogo(String origin, int pow, int start, int answer, boolean[] isRight){
		for(int i = start+1; i <= origin.length(); i++){
			String go = origin.substring(start,i);
			gogo(origin, pow, i, answer + Integer.parseInt(go), isRight);
		}
		if(start == origin.length() && answer == pow) {
			System.out.println("end .. : " +answer);
			isRight[0] = true;
		}
	}
	
}
