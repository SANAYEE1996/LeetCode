package medium;

import java.util.Arrays;

public class VowelStrings {
	public int[] vowelStrings(String[] words, int[][] queries) {
		int[] answer = new int[queries.length];
		boolean[] isVowelString = new boolean[words.length];
		for(int i = 0; i < words.length; i++) {
			isVowelString[i] = "aeiou".contains(String.valueOf(words[i].charAt(0))) && "aeiou".contains(String.valueOf(words[i].charAt(words[i].length()-1)));
		}
		int sum = 0;
		int[] sumList = new int[isVowelString.length];
		for(int i = 0; i < sumList.length; i++) {
			if(isVowelString[i]) {
				sum++;
			}
			sumList[i] = sum;
		}
		System.out.println(Arrays.toString(isVowelString));
		System.out.println(Arrays.toString(sumList));
		for(int i = 0; i < queries.length; i++) {
			answer[i] = sumList[queries[i][1]] - sumList[queries[i][0]] -1 + (isVowelString[queries[i][1]] ? 1 : 0) + (isVowelString[queries[i][0]] ? 1 : 0);
		}
		return answer;
    }
	
	public static void main(String[] args) {
		VowelStrings s = new VowelStrings();
		String[] words = {"aba","bcb","ece","aa","e","abcd","eee","nnn"};
		int[][] queries = {{0,2},{1,4},{1,1},{3,6},{4,6},{5,6},{1,3}};
		System.out.println(Arrays.toString(s.vowelStrings(words, queries)));
		words = new String[] {"a","e","i"};
		queries = new int[][] {{0,2},{0,1},{2,2}};
		System.out.println(Arrays.toString(s.vowelStrings(words, queries)));
	}
	
}
