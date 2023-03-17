package medium;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Trie {
	
	LinkedHashSet<String> set;
	
	public Trie() {
        set = new LinkedHashSet<>();
    }
    
    public void insert(String word) {
        set.add(word);
    }
    
    public boolean search(String word) {
    	return set.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			if(iterator.next().startsWith(prefix)) {
				return true;
			}
		}
    	return false;
    }
}
