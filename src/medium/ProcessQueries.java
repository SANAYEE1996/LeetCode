package medium;

import java.util.HashMap;

public class ProcessQueries {
	public int[] processQueries(int[] queries, int m) {
        HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
        for(int i = 1; i <= m; i++){
            valueIndexMap.put(i, i-1);
        }
        int[] answer = new int[queries.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = getIndex(valueIndexMap, queries[i]);
        }
        return answer;
    }

    private int getIndex(HashMap<Integer, Integer> map, int target){
        int originIndex = map.get(target);
        for(int key : map.keySet()){
            if(map.get(key) < originIndex){
                map.put(key, map.get(key)+1);
            }
        }
        map.put(target, 0);
        return originIndex;
    }
}
