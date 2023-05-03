package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FindThePrefixCommonArray {
	public int[] findThePrefixCommonArray(int[] A, int[] B) {
		HashMap<Integer, Integer> aMap = new HashMap<>();
		HashMap<Integer, Integer> bMap = new HashMap<>();
		
		int[] answer = new int[A.length];
		
		for(int i = 0; i < A.length; i++){
			if(!aMap.containsKey(A[i])){
				aMap.put(A[i], 0);
			}
			if(!bMap.containsKey(B[i])){
				bMap.put(B[i], 0);
			}
			aMap.put(A[i], aMap.get(A[i])+1);
			bMap.put(B[i], bMap.get(B[i])+1);
			answer[i] = getCommonCount(A,B,aMap,bMap,i);
		}
		
		return answer;
	}

	private int getCommonCount(int[] A, int[] B, HashMap<Integer, Integer> aMap, HashMap<Integer, Integer> bMap, int index){
		int commonCount = 0;
		HashSet<Integer> keySet = new HashSet<>();
		keySet.addAll(aMap.keySet());
		keySet.addAll(bMap.keySet());
		Iterator<Integer> keyIter = keySet.iterator();
		int key = 0;
		while(keyIter.hasNext()){
			key = keyIter.next();
			if(aMap.containsKey(key) && bMap.containsKey(key) && aMap.get(key) == bMap.get(key)){
				commonCount++;
			}
		}
		return commonCount;
	}
}
