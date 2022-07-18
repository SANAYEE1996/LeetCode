package easy;

import java.util.ArrayList;

public class IsPalindrome {
	
	public int getSize(int x) {
		long value = 10;
		int size = 0;
		while(true) {
			value = (long)Math.pow(10, size);
			if(x%value == x) break;
			size++;
		}
		return size--;
	}
	
	public void putNumberToList(ArrayList<Integer> list, int size, int x) {
		long value = 0;
		long mot = 0;
		for(int i = size-1; i >= 0; i--) {
			value = (long)Math.pow(10, i);
			mot = x/value;
			list.add((int) mot);
			x -= mot*value;
		}
	}
	
	public boolean checkPalen(ArrayList<Integer> list) {
		int mediumIndex = list.size()/2;
		int j = list.size()-1;
		for(int i = 0; i < mediumIndex; i++) {
			if(list.get(i) != list.get(j)) return false;
			j--;
		}
		return true;
	}
	
	public boolean isPalindrome(int x) {
        if(x < 0) return false;
        ArrayList<Integer> list = new ArrayList<>();
        putNumberToList(list, getSize(x), x);
        return checkPalen(list);
    }
}
