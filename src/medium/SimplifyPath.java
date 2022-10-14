package medium;

public class SimplifyPath {
	public String simplifyPath(String path) {
		StringBuilder sb = new StringBuilder(path.charAt(0));
		String exam;
		for(int i = 1; i < path.length(); i++) {
			exam = sb.toString();
			if(exam.charAt(exam.length()-1) == '/' && path.charAt(i) == '/') {
				continue;
			}
			else if(path.charAt(i) == '.') {
				continue;
			}
			sb.append(path.charAt(i));
		}
        return "";
    }
}
