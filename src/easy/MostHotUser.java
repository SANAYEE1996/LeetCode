package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class MostHotUser {
	void addMenuToMap(HashMap<String, HashSet<String>> userMenuMap, String[] exam, String key,HashMap<String, Integer> userMenuCountMap) {
		for(int i = 1; i < exam.length; i++) 
			userMenuMap.get(key).add(exam[i]);
		userMenuCountMap.put(key, userMenuMap.get(key).size());
	}
	
	void addUserToMap(HashMap<String, HashSet<String>> userMenuMap, String user,HashMap<String, Integer> userMenuCountMap) {
		if(!userMenuMap.containsKey(user)) { 
			userMenuMap.put(user, new HashSet<String>());
			userMenuCountMap.put(user, 0);
		}
	}
	
	void addToMap(String[] orders, HashMap<String, HashSet<String>> userMenuMap, HashMap<String, Integer> userMenuCountMap) {
		String[] exam;
        for(String s : orders) {
        	exam = s.split(" ");
        	addUserToMap(userMenuMap, exam[0],userMenuCountMap);
        	addMenuToMap(userMenuMap, exam, exam[0],userMenuCountMap);
        }
	}
	
	
	void sortUserMenuCountMap(HashMap<String, Integer> userMenuCountMap, LinkedList<Map.Entry<String, Integer>> entryList) {
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
		    @Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		    	if(o2.getValue() == o1.getValue()) {
		    		return o1.getKey().compareTo(o2.getKey());
		    	}
		    	return o2.getValue() - o1.getValue();
		    }
		});
	}
	
	void addHotUser(LinkedList<Map.Entry<String, Integer>> entryList, ArrayList<String> maxMenuCountUserList) {
		int maxValue = entryList.get(0).getValue();
		for(Map.Entry<String, Integer> entry : entryList){
			if(entry.getValue() != maxValue) break;
			maxMenuCountUserList.add(entry.getKey());
		}
	}
	
	public String[] mostHotUser(String[] orders) {
        HashMap<String, HashSet<String>> userMenuMap = new HashMap<>();
        HashMap<String, Integer> userMenuCountMap = new HashMap<>();
        
        addToMap(orders, userMenuMap, userMenuCountMap);
        
        LinkedList<Map.Entry<String, Integer>> entryList = new LinkedList<>(userMenuCountMap.entrySet());
        ArrayList<String> maxMenuCountUserList = new ArrayList<>();
        
        sortUserMenuCountMap(userMenuCountMap, entryList);
		addHotUser(entryList, maxMenuCountUserList);
		String[] answer = new String[maxMenuCountUserList.size()];
		for(int i = 0; i < answer.length; i++) answer[i] = maxMenuCountUserList.get(i);
		
        return answer;
    }
}
