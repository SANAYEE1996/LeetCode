package hard;

import java.util.ArrayList;

public class GetPermutation {
	
	private String[] configArray = {"1","2","3","4","5","6","7","8","9"};
	
	int getFact(int i) {
		int value = 1;
		for(int j = 1; j <= i; j++) value *= j;
		return value;
	}
	
	public int[] getPermutateArray(int n) {
		int[] permutateArray = new int[n-1];
		int j = 0;
		for(int i = n-1; i >= 1; i--) {
			permutateArray[j] = getFact(i); j++;
		}
		return permutateArray;
	}
	
	public String getPermutation(int n, int k) {
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < n; i++) list.add(configArray[i]);
		int[] permutateArray = getPermutateArray(n);
		int nam = 0;
		StringBuilder sb = new StringBuilder();
		k--;
		for(int i : permutateArray) {
			nam = k%i;
			k /= i;
			if(!list.isEmpty()) {
				sb.append(list.get(k));
				list.remove(k);
			}
			k = nam;
		}
		if(!list.isEmpty()) sb.append(list.get(0));
		return sb.toString();
    }
}
