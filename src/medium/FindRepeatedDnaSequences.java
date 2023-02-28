package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRepeatedDnaSequences {
	public List<String> findRepeatedDnaSequences(String s) {
        String dnaString = "";
        HashMap<String, Integer> dnaMap = new HashMap<>();
        for(int i = 0; i <= s.length()-10; i++){
            dnaString = s.substring(i,i+10);
            if(!dnaMap.containsKey(dnaString)){
                dnaMap.put(dnaString, 0);
            }
            dnaMap.put(dnaString, dnaMap.get(dnaString)+1);
        }
        List<String> answerList = new ArrayList<>();
        for(String key : dnaMap.keySet()){
            if(dnaMap.get(key) >= 2){
            	answerList.add(key);
            }
        }
        return answerList;
    }
}
