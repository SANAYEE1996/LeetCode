package medium;

import java.util.HashMap;

public class MinOperationsBinary {
	public int minOperations(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		putMap(n, map);
		return map.get(n);
    }
	
	private void putMap(int n, HashMap<Integer, Integer> map){
		int differBefore = 0;
		int differAfter = 0;
		int i = 0;
		while(true){
			if(Math.pow(2,i) <= n && n <= Math.pow(2,i+1)){
				break;
			}
			i++;
		}
		differBefore = (int) (n-Math.pow(2,i));
		differAfter = (int) (Math.pow(2,i+1)-n);
		if(differBefore == 0 || differAfter == 0){
			map.put(n,1);
			return;
		}
		if(isTwoPow(differBefore) || isTwoPow(differAfter)){
			map.put(n,2);
			return;
		}
		putMap(differBefore, map);
		putMap(differAfter, map);
		map.put(n, Math.min(map.get(differBefore), map.get(differAfter))+1);
	}
	
	private boolean isTwoPow(int n){
		while(n != 0){
			if(n%2 == 1){
				return false;
			}
			n /= 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		MinOperationsBinary s = new MinOperationsBinary();
		
		
		System.out.println(s.minOperations(39));
		System.out.println(s.minOperations(54));
		System.out.println(s.minOperations(25));
		System.out.println(s.minOperations(668));
	}
}
