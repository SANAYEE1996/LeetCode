package medium;

import java.util.ArrayList;

public class SnapshotArray {
	private int[] map;
	private ArrayList<int[]> snapList;
	private int snap_id;
	
    public SnapshotArray(int length) {
        map = new int[length];
		snap = new ArrayList<>();
		snap_id = 0;
    }
    
    public void set(int index, int val) {
        map[index] = val;
    }
    
    public int snap() {
        snap_id++;
		snapList.add(map.clone());
		return snap_id-1;
    }
    
    public int get(int index, int snap_id) {
        if(snapList.isEmpty() || snapList.size() < snap_id){
			return 0;
		}
		return snapList.get(snap_id)[index];
    }
}
