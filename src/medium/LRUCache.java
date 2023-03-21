package medium;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
	
	private HashMap<Integer, Integer> map;
	private HashMap<Integer, Integer> keyIndexMap;
	private LinkedList<Integer> recentKeyList;
	private int capacity;

	public LRUCache(int capacity) {
		map = new HashMap<>();
		keyIndexMap = new HashMap<>();
		recentKeyList = new LinkedList<>();
		this.capacity = capacity;
	}

	public int get(int key) {
		if(!map.containsKey(key)){
			return -1;
		}
		updateMap(key);
		return map.get(key);
	}

	public void put(int key, int value) {
		if(map.containsKey(key)){
			map.put(key,value);
			updateMap(key);
			return;
		}
		if(map.size() == capacity){
			map.put(key,value);
			lruActive(key);
			return;
		}
		map.put(key,value);
		updateMap(key);
	}
	
	private void updateMap(int key) {
		if(keyIndexMap.containsKey(key)){
			int index = keyIndexMap.get(key);
			recentKeyList.remove(index);
			recentKeyList.add(key);
			int lastIndex = recentKeyList.size()-1;
			keyIndexMap.put(key,lastIndex);
		}
		else{
			recentKeyList.add(key);
			int lastIndex = recentKeyList.size()-1;
			keyIndexMap.put(key,lastIndex);
		}
	}
	
	private void lruActive(int key) {
		int mapKey = recentKeyList.get(0);
		keyIndexMap.remove(mapKey);
		for(int keyIndexMapKey : keyIndexMap.keySet()){
			keyIndexMap.put(keyIndexMapKey, keyIndexMap.get(keyIndexMapKey)-1);
		}
		map.remove(mapKey);
		recentKeyList.remove(0);
		recentKeyList.add(key);
		int lastIndx = recentKeyList.size()-1;
		keyIndexMap.put(key,lastIndx);
	}
}
