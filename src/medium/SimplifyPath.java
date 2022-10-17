package medium;

public class SimplifyPath {
	public String simplifyPath(String path) {
		StringBuilder sb = new StringBuilder();
		StringBuilder middle = new StringBuilder();
		sb.append(path.charAt(0));
		String exam;
		for(int i = 1; i < path.length(); i++) {
			exam = sb.toString();
			if(path.charAt(i) == '/' && exam.charAt(exam.length()-1) == '/') {
				continue;
			}
			else if(path.charAt(i) == '/') {
				if(middle.toString().equals(".")) {
					middle.setLength(0);
					sb.deleteCharAt(sb.toString().length()-1);
					continue;
				}
				else if(middle.toString().equals("..")) {
					System.out.println("input : " + path);
					System.out.println("check");
					sb.deleteCharAt(sb.toString().length()-1);
					sb.deleteCharAt(sb.toString().length()-1);
					exam = sb.toString();
					sb.setLength(0);
					sb.append(getParentPath(exam));
					middle.setLength(0);
					System.out.println(sb.toString());
					continue;
				}
				sb.append('/');
				middle.setLength(0);
				continue;
			}
			middle.append(path.charAt(i));
			sb.append(path.charAt(i));
		}
		System.out.println(middle.toString());
		if(middle.toString().equals(".")) {
			return getOneMoreCheck(sb.toString());
		}
		else if(sb.toString().length() > 1 && middle.toString().equals("")) {
			return sb.toString().substring(0, sb.toString().length()-1);
		}
		else if(middle.toString().equals("..")) {
			sb.deleteCharAt(sb.toString().length()-1);
			sb.deleteCharAt(sb.toString().length()-1);
			return getOneMoreCheck(getParentPath(sb.toString()));
		}
        return sb.toString();
    }
	
	private String getOneMoreCheck(String s) {
		for(int i = s.length()-1; i > 0; i--) {
			if(s.charAt(i) != '/' && s.charAt(i) != '.') {
				return s.substring(0, i+1);
			}
		}
		return "/";
	}
	
	private String getParentPath(String s) {
		for(int i = s.length()-2; i > 0; i--) {
			if(s.charAt(i) == '/') {
				return s.substring(0, i+1);
			}
		}
		return "/";
	}
	
	
	
}
