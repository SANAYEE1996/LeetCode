package medium;

public class SimplifyPath {
	public String simplifyPath(String path) {
		StringBuilder sb = new StringBuilder();
		sb.append(path.charAt(0));
		String exam;
		for(int i = 1; i < path.length(); i++) {
			exam = sb.toString();
			if(path.charAt(i) == '/' && exam.charAt(exam.length()-1) == '/') {
				continue;
			}
			else if(path.charAt(i) == '.') {
				if(i+2 < path.length() && path.charAt(i+1) == '.' && path.charAt(i+2) == '/') {
					i++;
					sb.setLength(0);
					sb.append(getBeforePath(exam));
					continue;
				}
				else if(i+1 < path.length() && path.charAt(i+1) == '/') {
					continue;
				}
			}
			else if(path.charAt(i) == '/' && i == path.length()-1) {
				break;
			}
			sb.append(path.charAt(i));
		}
        return oneMoreCheck(sb.toString());
    }
	
	private String oneMoreCheck(String s) {
		for(int i = s.length()-1; i > 0; i--) {
			if(s.charAt(i) != '/') {
				return s.substring(0, i+1);
			}
		}
		return "/";
	}
	
	private String getBeforePath(String s) {
		for(int i = s.length()-2; i > 0; i--) {
			if(s.charAt(i) == '/') {
				return s.substring(0, i);
			}
		}
		return "/";
	}
	
	
}
