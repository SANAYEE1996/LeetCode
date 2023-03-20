package easy;

import java.util.ArrayList;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < flowerbed.length; i++) {
        	if(flowerbed[i] == 1) {
        		list.add(i);
        	}
        }
        if(!list.isEmpty()) {
	        int beforeIndex = list.get(0);
	        int value = (beforeIndex)/2;
	        if(value > 0) {
	    		n -= value;
	    	}
	        for(int i = 1; i < list.size(); i++) {
	        	value = (list.get(i)-beforeIndex)/2 -1;
	        	if(value > 0) {
	        		n -= value;
	        	}
	        	beforeIndex = list.get(i);
	        }
	        value = (flowerbed.length-1 - beforeIndex)/2;
	        if(value > 0) {
	    		n -= value;
	    	}
        }
        else {
        	n = (flowerbed.length % 2 == 0) ? n - flowerbed.length/2 : n -(flowerbed.length/2+1); 
        }
		return n <= 0;
    }
}
