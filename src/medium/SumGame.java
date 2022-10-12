package medium;

public class SumGame {
	
	
	/* alice		bob
	 * ?329 		5???
	 * 
	 * */
	public boolean sumGame(String num) {
        int beforeSum = 0;
        int afterSum = 0;
        int beforeUnknownCount = 0;
        int afterUnknownCount = 0;
        for(int i = 0; i < num.length()/2; i++) {
        	if(num.charAt(i) == '?') {
        		beforeUnknownCount++;
        		continue;
        	}
        	beforeSum += (int) num.charAt(i);
        }
        for(int i = num.length()/2; i < num.length(); i++) {
        	if(num.charAt(i) == '?') {
        		beforeUnknownCount++;
        		continue;
        	}
        	afterSum += (int) num.charAt(i);
        }
		
		
		return false;
    }
}
