package medium;

import java.util.HashMap;

public class UndergroundSystem {
	
	/**
	 * https://leetcode.com/problems/design-underground-system/submissions/
	 * 
	 * */
	
	private HashMap<String, HashMap<String, int[]>> map;
	private HashMap<Integer, Integer> time;
	private HashMap<Integer, String> station;

    public UndergroundSystem() {
        map = new HashMap<>();
        time = new HashMap<>();
		station = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        time.put(id, t);
		station.put(id, stationName);
    }
    
    public void checkOut(int id, String stationName, int t) {
        int wasteTime = t - time.get(id);
		String start = station.get(id);
		time.remove(id);
		station.remove(id);
		String arrive = stationName;
		if(!map.containsKey(start)){
			map.put(start, new HashMap<>());
		}
		HashMap<String, int[]> arriveMap = map.get(start);
		if(!arriveMap.containsKey(arrive)){
			arriveMap.put(arrive, new int[]{0,0});
		}
		int[] arriveArray = arriveMap.get(arrive);
		arriveArray[0]++;
		arriveArray[1] += wasteTime;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int[] arr = map.get(startStation).get(endStation);
		return arr[1]/(double)arr[0];
    }
}
