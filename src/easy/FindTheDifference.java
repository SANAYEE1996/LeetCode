package easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
	
	/**
	 * https://leetcode.com/problems/find-the-difference/?envType=daily-question&envId=2023-09-25
	 * */
	
	public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char sKey = 0;
        char tKey = 0;
        for(int i = 0; i < s.length(); i++){
            sKey = s.charAt(i);
            tKey = t.charAt(i);
            if(!sMap.containsKey(sKey)) sMap.put(sKey, 0);
            if(!tMap.containsKey(tKey)) tMap.put(tKey, 0);
            sMap.put(sKey, sMap.get(sKey)+1);
            tMap.put(tKey, tMap.get(tKey)+1);
        }
        tKey = t.charAt(t.length()-1);
        if(!tMap.containsKey(tKey)) tMap.put(tKey, 0);
        tMap.put(tKey, tMap.get(tKey)+1);
        for(char key : tMap.keySet()){
            if(!sMap.containsKey(key) || sMap.get(key) < tMap.get(key)) return key;
        }
        return t.charAt(t.length()-1);
    }
}
