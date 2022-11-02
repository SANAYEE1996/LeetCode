package medium;

import java.util.ArrayList;

public class EvalRPN {
	public int evalRPN(String[] tokens) {
        
		ArrayList<Integer> list = new ArrayList<>();
		for(String str : tokens){
			if(isCalculate(str)){
				goCalculate(list, str);
			}
			else{
				list.add(Integer.parseInt(str));
			}
		}
		return list.get(0);
    }
	
	private void goCalculate(ArrayList<Integer> list, String a){
		int before = list.get(list.size() - 2);
		int after = list.get(list.size() - 1);
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		if(a.equals("+")){
			list.add(before + after);
		}
		else if(a.equals("-")){
			list.add(before - after);
		}
		else if(a.equals("/")){
			list.add(before / after);
		}
		else if(a.equals("*")){
			list.add(before * after);
		}
	}

	private boolean isCalculate(String a){
		if(a.equals("+") || a.equals("-") || a.equals("/") || a.equals("*")){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		EvalRPN s = new EvalRPN();
		
		System.out.println(s.evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
		System.out.println(s.evalRPN(new String[] {"2","1","+","3","*"}));
		System.out.println(s.evalRPN(new String[] {"4","13","5","/","+"}));
	}
}
