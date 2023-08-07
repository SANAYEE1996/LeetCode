package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
	
	/**
	 * https://leetcode.com/problems/word-break/
	 * */
	
	public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,new HashSet<>(wordDict),new HashMap<String, Boolean>());
    }
	
    private boolean helper(String s, HashSet<String>dict,HashMap<String,Boolean>dp){
        if(s.length()==0)return true;
        if(dict.contains(s))return true;
        
        if(dp.containsKey(s))return dp.get(s);
        
        for(int i=1;i<s.length();i++){
            String subs = s.substring(0,i);
            if(dict.contains(subs)&&helper(s.substring(i),dict,dp)){
                dp.put(subs,true);
                return true;
            }
        }
        dp.put(s,false);
        return false;
    }
}
