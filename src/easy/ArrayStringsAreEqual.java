package easy;

public class ArrayStringsAreEqual {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1String = new StringBuilder();
        StringBuilder word2String = new StringBuilder();
        for(String s : word1) word1String.append(s);
        for(String s : word2) word2String.append(s);
        return word1String.toString().equals(word2String.toString());
    }
}
