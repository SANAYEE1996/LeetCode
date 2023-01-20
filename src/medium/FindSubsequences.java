package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindSubsequences {
	
	private HashSet<List<Integer>> set;
	
	public List<List<Integer>> findSubsequences(int[] nums) {
		List<List<Integer>> answerList = new ArrayList<>();
		set = new HashSet<>();
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] <= nums[i+1]) {
				ArrayList<Integer> exam = new ArrayList<>();
				exam.add(nums[i]);
				for(; i < nums.length-1; i++) {
					if(nums[i] > nums[i+1]) {
						i--;
						break;
					}
					exam.add(nums[i+1]);
				}
				putListToList(exam);
			}
		}
		Iterator<List<Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
        	answerList.add(iterator.next());
        }
		return answerList;
    }
	
	private void putListToList(ArrayList<Integer> exam) {
		for(int i = 0; i < exam.size(); i++) {
			ArrayList<Integer> ship = new ArrayList<>();
			ship.add(exam.get(i));
			gogo(exam, ship, i+1);
		}
	}
	
	private void gogo(ArrayList<Integer> origin, ArrayList<Integer> before, int start) {
		for(int i = start; i < origin.size(); i++) {
			ArrayList<Integer> copy = new ArrayList<>(before);
			copy.add(origin.get(i));
			set.add(copy);
			gogo(origin, new ArrayList<>(copy), i+1);
		}
	}
	
	public static void main(String[] args) {
		FindSubsequences s = new FindSubsequences();
		System.out.println(s.findSubsequences(new int[] {4,6,7,7}));
		System.out.println(s.findSubsequences(new int[] {4,4,3,2,1}));
		
		System.out.println(s.findSubsequences(new int[] {1,2,3,4,5,2,1,0,-1,0,2,8,7,5,3,99,100}));
		
		System.out.println(s.findSubsequences(new int[] {1,2,3,4,5,4,3,2,1,2,3,4,5,4,3,2,1}));
		
		System.out.println(s.findSubsequences(new int[] {100,100,100,99,100,100,100,100}));
		
		System.out.println(s.findSubsequences(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}).size());
		System.out.println(s.findSubsequences(new int[] {1,2,3,4,5,6,7,8,9,10,1,1,1,1,1}));
	}
}
