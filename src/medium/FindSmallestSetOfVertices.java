package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindSmallestSetOfVertices {
	
	/**
	 * 
	 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
	 * 
	 * Find the smallest set of vertices from which all nodes in the graph are reachable. 
	 * It's guaranteed that a unique solution exists.
	 * 
	 * */
	
	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		List<Integer> answerList = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for(List<Integer> list : edges){
			set.add(list.get(0));
			set.add(list.get(1));
		}
		for(List<Integer> list : edges){
			set.remove(list.get(1));
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			answerList.add(iter.next());
		}
		return answerList;
	}
}
