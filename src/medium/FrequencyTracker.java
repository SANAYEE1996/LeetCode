package medium;

import java.util.HashMap;
import java.util.HashSet;

public class FrequencyTracker {
	private HashMap<Integer, Integer> valueFrequencyMap;
	private HashMap<Integer, HashSet<Integer>> frequencyValueMap;
	
    public FrequencyTracker() {
        valueFrequencyMap = new HashMap<>();
		frequencyValueMap = new HashMap<>();
    }
    
    public void add(int number) {
        if(!valueFrequencyMap.containsKey(number)){
			valueFrequencyMap.put(number,0);
		}
		
		int frequency = valueFrequencyMap.get(number);
		if(!frequencyValueMap.containsKey(frequency)){
			frequencyValueMap.put(frequency, new HashSet<>());
		}
		frequencyValueMap.get(frequency).remove(number);
		
		frequency++;
		valueFrequencyMap.put(number, frequency);
		if(!frequencyValueMap.containsKey(frequency)){
			frequencyValueMap.put(frequency, new HashSet<>());
		}
		frequencyValueMap.get(frequency).add(number);
		
    }
    
    public void deleteOne(int number) {
		if(!valueFrequencyMap.containsKey(number)){
			return;
		}
		int frequency = valueFrequencyMap.get(number);
		if(frequencyValueMap.containsKey(frequency)){
			frequencyValueMap.get(frequency).remove(number);
		}
		if(frequency >= 1){
			frequency--;
			valueFrequencyMap.put(number, frequency);
			if(!frequencyValueMap.containsKey(frequency)){
				frequencyValueMap.put(frequency, new HashSet<>());
			}
			frequencyValueMap.get(frequency).add(number);
		}
    }
    
    public boolean hasFrequency(int frequency) {
    	if(!frequencyValueMap.containsKey(frequency)) {
    		return false;
    	}
        return !frequencyValueMap.get(frequency).isEmpty();
    }
}
