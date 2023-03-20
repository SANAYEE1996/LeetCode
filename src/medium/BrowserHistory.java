package medium;

import java.util.ArrayList;

public class BrowserHistory {
	
	private ArrayList<String> list;
	private int nowIndex;
	
	public BrowserHistory(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        nowIndex = 0;
    }
    
    public void visit(String url) {
        ArrayList<String> copyList = new ArrayList<>();
        for(int i = 0; i <= nowIndex; i++) {
        	copyList.add(list.get(i));
        }
        copyList.add(url);
        list = new ArrayList<>(copyList);
        nowIndex = list.size()-1;
    }
    
    public String back(int steps) {
    	nowIndex -= steps;
        nowIndex = nowIndex < 0 ? 0 : nowIndex;
    	return list.get(nowIndex);
    }
    
    public String forward(int steps) {
        nowIndex += steps;
        nowIndex = nowIndex > list.size()-1 ? list.size()-1 : nowIndex;
    	return list.get(nowIndex);
    }
}
