package easy;

import java.util.ArrayList;

public class MakeGoodString {
	public String makeGood(String s) {
        ArrayList<Character> stringList = new ArrayList<>();
        stringList.add('@');
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Math.abs(s.charAt(i) - stringList.get(stringList.size()-1)) == 32){
                stringList.remove(stringList.size()-1);
                continue;
            }
            stringList.add(s.charAt(i));
        }
        for(int i = 1; i < stringList.size(); i++){
            sb.append(stringList.get(i));
        }
        return sb.toString();
    }
}
