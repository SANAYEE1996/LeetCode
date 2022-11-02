package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMutation {
	public int minMutation(String start, String end, String[] bank) {
        ArrayList<String> bankList = new ArrayList<>(Arrays.asList(bank));
        ArrayList<Integer> countList = new ArrayList<>();
        goMutate(bankList, start, end, 0, countList);
		if(countList.size() == 0) {
			return -1;
		}
		return Collections.min(countList);
    }
	
	private boolean isDifferOnlyOne(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		int differCount = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != b.charAt(i)) {
				differCount++;
			}
			if(differCount > 1) {
				return false;
			}
		}
		if(differCount == 0) {
			return false;
		}
		return true;
	}
	
	private void goMutate(ArrayList<String> list, String exam, String end, int count, ArrayList<Integer> countList) {
		if(exam.equals(end)) {
			countList.add(count);
			return;
		}
		for(int i = 0; i < list.size(); i++) {
			if(isDifferOnlyOne(exam, list.get(i))) {
				ArrayList<String> shipList = new ArrayList<>(list);
				shipList.remove(i);
				goMutate(shipList, list.get(i), end, count+1, countList);
			}
		}
	}
}
