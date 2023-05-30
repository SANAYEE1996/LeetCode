package easy;

import java.util.HashMap;

public class MyHashSet {
	
	private HashMap<Integer, Object> map;
	private static final Object PRESENT = new Object();

    public MyHashSet() {
        map = new HashMap<>();
    }
    
    public void add(int key) {
        map.put(key, PRESENT);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        return map.containsKey(key);
    }
    
}
