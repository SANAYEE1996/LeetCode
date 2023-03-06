package medium;

public class FindArray {
	public int[] findArray(int[] pref) {
		int beforePref = pref[0];
		int value = 0;
        for(int i = 1; i < pref.length; i++) {
        	value = beforePref^pref[i];
        	beforePref = pref[i];
        	pref[i] = value;
        }
		return pref;
    }
}
