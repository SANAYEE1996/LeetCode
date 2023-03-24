package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class MinReorder {
	
	private HashMap<Integer, ArrayList<Integer>> inToMap;
	private HashMap<Integer, ArrayList<Integer>> outToMap;
	private int swapCount;
	
	
	public int minReorder(int n, int[][] connections) {
		inToMap  = new HashMap<>();
		outToMap = new HashMap<>();
		swapCount = 0;
		for(int[] i : connections){
			if(!inToMap.containsKey(i[1])){
				inToMap.put(i[1], new ArrayList<>());
			}
			if(!outToMap.containsKey(i[0])){
				outToMap.put(i[0], new ArrayList<>());
			}
			inToMap.get(i[1]).add(i[0]);
			outToMap.get(i[0]).add(i[1]);
		}
		System.out.println("----------into Map-----------");
		printMap(inToMap);
		System.out.println("----------out Map-----------");
		printMap(outToMap);
		searchOutToMap(0);
		System.out.println("----------into Map-----------");
		printMap(inToMap);
		System.out.println("----------out Map-----------");
		printMap(outToMap);
		searchInToMap(0);
		return swapCount;
    }
	
	private void searchOutToMap(int value){
		if(outToMap.containsKey(value)){
			int key = value;
			ArrayList<Integer> swapValueList = outToMap.get(key);
			System.out.println("key :: "+key+" -> swapValueList : "+swapValueList);
			outToMap.remove(value);
			if(!inToMap.containsKey(key)) {
				inToMap.put(key, new ArrayList<>());
			}
			swapValueListAnswerIncrease(swapValueList, key);
			for(int i : swapValueList){
				searchOutToMap(i);
			}
		}
	}

	private void searchInToMap(int key){
		if(inToMap.containsKey(key)){
			ArrayList<Integer> swapValueList = inToMap.get(key);
			System.out.println("into Map list : " +swapValueList);
			for(int i : swapValueList){
				searchOutToMap(i);
			}
		}
	}
	
	private void swapValueListAnswerIncrease(ArrayList<Integer> swapValueList, int key) {
		for(int i : swapValueList){
			inToMap.get(key).add(i);
			swapCount++;
			System.out.println(i +" is put in to this key map : "+ key);
		}
	}
	
	private void printMap(HashMap<Integer, ArrayList<Integer>> map) {
		for(int key : map.keySet()) {
			System.out.println("key : " +key + " ans value List : " +map.get(key));
		}
	}
}
