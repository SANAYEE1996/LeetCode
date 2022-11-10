package easy;

public class RemoveDuplicatesString {
	public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char lastChar = s.charAt(0);
        int length = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == lastChar){
                sb.deleteCharAt(length-1);
                length--;
                if(sb.toString().length() > 0){
                    lastChar = sb.toString().charAt(length-1);
                }
                else{
                    lastChar = 0;
                }
                continue;
            }
            length++;
            lastChar = s.charAt(i);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
