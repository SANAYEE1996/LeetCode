package medium;

public class RemoveDuplicatesString {
	
	/**
	 * 
	 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
	 * 
	 * 1 <= s.length <= 100,000
	 * 
	 * */
	
	public String removeDuplicates(String s, int k) {
		System.out.println("input : " +s);
		StringBuilder sb = new StringBuilder();
		sb.append('!');
		int dupCount = 1;
		for(int i = 0; i < s.length(); i++){
			
			String sbPart = sb.toString();
			char lastChar = sbPart.charAt(sbPart.length()-1);
			dupCount = (s.charAt(i) == lastChar) ? (dupCount + 1) : 1;
			
			System.out.println("sb : " +sbPart + "  and count : " +dupCount );
			if(dupCount == k){
				for(int j = 0; j < k-1; j++){
					String sbDel = sb.toString();
					sb.deleteCharAt(sbDel.length() - 1);
				}
				dupCount = 1;
				continue;
			}
			sb.append(s.charAt(i));
		}
		
		return sb.toString().substring(1);
	}
}
