package medium;

public class LengthOfLongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
		 if(s.equals("")) return 0;
		 StringBuilder sb = new StringBuilder();
		 sb.append(s.charAt(0));
		 String exam = "";
		 int index = 0;
		 int max = 0;
		 for(int i = 1; i < s.length(); i++) {
			 max = Math.max(max, sb.toString().length());
			 index = sb.toString().lastIndexOf(String.valueOf(s.charAt(i)));
			 if(index >= 0) {
				 exam = sb.toString().substring(index+1);
				 sb.setLength(0);
				 sb.append(exam);
				 sb.append(s.charAt(i));
				 continue;
			 }
			 sb.append(s.charAt(i));
		 }
		 return Math.max(max, sb.toString().length());
	 }
}
