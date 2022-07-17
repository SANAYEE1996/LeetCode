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
		System.out.println(k);
		StringBuilder sb = new StringBuilder();
		for(int i : permutateArray) {
			nam = k%i;
			k /= i;
			System.out.println("몫 : "+k + " // 나머지 : " +nam);
			if(k >= 0 && list.size() > 0) {
				sb.append(list.get(k));
				list.remove(k);
			}
			System.out.println(sb.toString() + " 남은 리스트 : " + list);
			k = nam;
		}
		
		return "";
    }
}
