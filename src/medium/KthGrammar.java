package medium;

import java.util.ArrayList;
import java.util.List;

public class KthGrammar {
	
	/**
	 * https://leetcode.com/problems/k-th-symbol-in-grammar/?envType=daily-question&envId=2023-10-25
	 * */
	
	public int kthGrammar(int n, int k) {
		List<String> list = new ArrayList<>();
		list.add("0");
		for(int i = 0; i < n-1; i++){
			makeString(list);
		}
		return Integer.parseInt(list.get(n-1).substring(k-1, k));
	}

	private void makeString(List<String> list){
		String lastWord = list.get(list.size()-1);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < lastWord.length(); i++){
			sb.append(lastWord.charAt(i) == '0' ? "01" : "10");
		}
		list.add(sb.toString());
	}

}
