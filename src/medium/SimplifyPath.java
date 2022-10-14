package medium;

public class SimplifyPath {
	public String simplifyPath(String path) {
		StringBuilder sb = new StringBuilder();
		sb.append(path.charAt(0));
		String exam;
		int beforeLastSlashIndex = 0;
		int lastSlashIndex = 0;
		for(int i = 1; i < path.length(); i++) {
			exam = sb.toString();
			if(exam.charAt(exam.length()-1) == '/' && path.charAt(i) == '/') {
				continue;
			}
			else if(i+2 < path.length() && path.substring(i, i+3).equals("../")) {
				sb.setLength(0);
				exam = exam.substring(0, beforeLastSlashIndex+1);
				lastSlashIndex = beforeLastSlashIndex;
				beforeLastSlashIndex = beforeLastIndex(exam);
				i = i+2;
				sb.append(exam);
				continue;
			}
			else if(i+1 < path.length() && path.substring(i, i+2).equals("./")) {
				i = i+1;
				continue;
			}
			else if(path.charAt(i) == '/' && i == path.length()-1) {
				continue;
			}
			else if(path.charAt(i) == '/') {
				beforeLastSlashIndex = lastSlashIndex;
				lastSlashIndex = exam.length();
			}
			sb.append(path.charAt(i));
		}
		if(sb.toString().charAt(sb.toString().length()-1) == '/') {
			return rightPath(sb.toString());
		}
        return sb.toString();
    }
	
	String rightPath(String s) {
		for(int i = s.length()-1; i >= 1; i--) {
			if(s.charAt(i) != '.' && s.charAt(i) != '/') {
				return s.substring(0, i+1);
			}
		}
		return s.substring(0,1);
	}
	
	int beforeLastIndex(String exam) {
		for(int i = exam.length()-2; i >=0; i--) {
			if(exam.charAt(i) == '/') {
				return i;
			}
		}
		return 0;
	}
	
}
