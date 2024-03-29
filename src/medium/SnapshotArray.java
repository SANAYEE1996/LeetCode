package medium;

import java.util.TreeMap;

public class SnapshotArray {
	
	/**
	 * https://leetcode.com/problems/snapshot-array/
	 * */
	
	private int snapId = 0;
    private TreeMap<Integer, Integer>[] historyRecords;
    
    public SnapshotArray(int length) {
        historyRecords = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            historyRecords[i] = new TreeMap<Integer, Integer>();
            historyRecords[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        historyRecords[index].put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snapId) {
        return historyRecords[index].floorEntry(snapId).getValue();
    }
}
