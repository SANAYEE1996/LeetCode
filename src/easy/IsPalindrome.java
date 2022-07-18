package easy;

public class IsPalindrome {
	
	public int getSize(int x) {
		int value = 10;
		int size = 0;
		while(true) {
			value = (int)Math.pow(10, size);
			if(x%value == x) break;
			size++;
		}
		return size--;
	}
	
	public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        return true;
    }
}
