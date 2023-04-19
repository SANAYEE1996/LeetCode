package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Twitter {
	
	private HashMap<Integer, ArrayList<Integer>> followMap;
	private HashMap<Integer, Integer> postUserMap;
	private ArrayList<Integer> postList;
	
	public Twitter() {
		followMap = new HashMap<>();
		postUserMap = new HashMap<>();
		postList = new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {
    	postUserMap.put(tweetId, userId);
    	postList.add(tweetId);
    }
    
    public List<Integer> getNewsFeed(int myId) {
    	ArrayList<Integer> myFollowList = followMap.get(myId);
    	int user_id = 0;
    	int post_id = 0;
    	ArrayList<Integer> getNewsFeed = new ArrayList<>();
    	for(int i = postList.size()-1; i >= 0; i--){
    		post_id = postList.get(i);
    		user_id = postUserMap.get(post_id);
    		if((myFollowList != null && myFollowList.contains(user_id)) || myId == user_id){
    			getNewsFeed.add(post_id);
    		}
    		if(getNewsFeed.size() == 10){
    			break;
    		}
    	}
        return getNewsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!followMap.containsKey(followerId)) {
        	followMap.put(followerId, new ArrayList<>());
        }
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        ArrayList<Integer> followList = followMap.get(followerId);
        if(followList == null) {
        	return;
        }
        int followerIndex = followList.indexOf(followeeId);
        followList.remove(followerIndex);
    }
}
