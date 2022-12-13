package easy;

public class CountTime {
	public int countTime(String time) {
        String[] timeStr = time.split(":");
        int timeCount = 1;
        if(timeStr[0].equals("??")){
            timeCount = 24;
        }
        else if(timeStr[0].charAt(0) == '?'){
            timeCount = (timeStr[0].charAt(1) > 51) ? 2 : 3;
        }
        else if(timeStr[0].charAt(1) == '?'){
            timeCount = (timeStr[0].charAt(0) > 49) ? 4 : 10;
        }

        if(timeStr[1].equals("??")){
            timeCount *= 60;
        }
        else if(timeStr[1].charAt(0) == '?'){
            timeCount *= 6;
        }
        else if(timeStr[1].charAt(1) == '?'){
            int gob = (timeStr[1].charAt(0) > 53) ? 1 : 10;
            timeCount *= gob;
        }

        return timeCount;
    }
}
