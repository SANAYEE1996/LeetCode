package easy;

public class AddDigits {
	public int addDigits(int num) {
        String s = String.valueOf(num);
        int answer = num;
        while(s.length() > 1){
            answer = 0;
            for(int i = 0; i < s.length(); i++){
                answer += ((int)s.charAt(i) - 48);
            }
            s = String.valueOf(answer);
        }
        return answer;
    }
}
