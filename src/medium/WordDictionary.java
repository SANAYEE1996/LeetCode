package medium;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class WordDictionary {
	
	private LinkedHashSet<String> set;
	
	public WordDictionary() {
        set = new LinkedHashSet<>();
    }
    
    public void addWord(String word) {
        set.add(word);
    }
    
    public boolean search(String word) {
        if(set.contains(word)) {
        	return true;
        }
        else if(!word.contains(".")) {
        	return false;
        }
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
        	if(isMatch(iter.next(), word)) {
        		return true;
        	}
        }
    	return false;
    }
    
    private boolean isMatch(String a, String b){
    	if(a.length() != b.length()){
    		return false;
    	}
    	for(int i = 0; i < a.length(); i++){
    		if(a.charAt(i) == '.' || b.charAt(i) == '.' || a.charAt(i) == b.charAt(i)){
    			continue;
    		}
    		else{
    			return false;
    		}
    	}
    	return true;
    }
}
