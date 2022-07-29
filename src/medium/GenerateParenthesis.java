package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        LinkedList<String> leftList = new LinkedList<>();
        LinkedList<String> rightList = new LinkedList<>();
        for(int i = 0; i < n; i++) {
        	leftList.add("(");
        	rightList.add(")");
        }
        leftList.remove(0);
        attach(leftList, rightList, answer, "(");
        return answer;
    }
	
	boolean isRight(String s) {
		ArrayList<Character> list = new ArrayList<>();
		list.add('!');
		for(int i = 0; i < s.length(); i++) {
			if(list.get(list.size()-1) == '(' && s.charAt(i) == ')') list.remove(list.size()-1);
			else list.add(s.charAt(i));
		}
		if(list.size() == 1) return true;
		return false;
	}
	
	void attach(LinkedList<String> leftList, LinkedList<String> rightList, List<String> answer, String parent) {
		if(!leftList.isEmpty()) {
			LinkedList<String> tempoLeftList = new LinkedList<>(leftList);
			tempoLeftList.remove(0);
			attach(tempoLeftList, rightList, answer, parent+"(");
		}
		if(!rightList.isEmpty()) {
			LinkedList<String> tempoRightList = new LinkedList<>(rightList);
			tempoRightList.remove(0);
			attach(leftList, tempoRightList, answer, parent+")");
		}
		if(leftList.isEmpty() && rightList.isEmpty() && isRight(parent)) {
			answer.add(parent);
		}
	}
	
	public static void main(String[] args) {
		GenerateParenthesis s = new GenerateParenthesis();
		
		System.out.println(s.generateParenthesis(3));
	}
	
}
