package medium;

public class WordSearchMap {
	
	
	public boolean exist(char[][] board, String word) {
		boolean[] isExist = {false};
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == word.charAt(0)) {
					boolean[][] isVisited = new boolean[board.length][board[i].length];
					isVisited[i][j] = true;
					isExistInBoard(i, j, board, word, isVisited, 1, isExist);
					if(isExist[0]) {
						return true;
					}
				}
			}
		}
		return false;
    }
	
	private void isExistInBoard(int i, int j, char[][] board, String word, boolean[][] isVisited, int wordIndex, boolean[] isExist) {
		if(wordIndex == word.length()) {
			isExist[0] = true;
			return;
		}
		if(i < board.length-1 && !isVisited[i+1][j] && board[i+1][j] == word.charAt(wordIndex)) {
			boolean[][] copiedVisited = copyArray(isVisited);
			copiedVisited[i+1][j] = true;
			isExistInBoard(i+1, j, board, word, copiedVisited, wordIndex+1, isExist);
		}
		if(i > 0 && !isVisited[i-1][j] && board[i-1][j] == word.charAt(wordIndex)) {
			boolean[][] copiedVisited = copyArray(isVisited);
			copiedVisited[i-1][j] = true;
			isExistInBoard(i-1, j, board, word, copiedVisited, wordIndex+1, isExist);
		}
		if(j < board[i].length-1 && !isVisited[i][j+1] && board[i][j+1] == word.charAt(wordIndex)) {
			boolean[][] copiedVisited = copyArray(isVisited);
			copiedVisited[i][j+1] = true;
			isExistInBoard(i, j+1, board, word, copiedVisited, wordIndex+1, isExist);
		}
		if(j > 0 && !isVisited[i][j-1] && board[i][j-1] == word.charAt(wordIndex)) {
			boolean[][] copiedVisited = copyArray(isVisited);
			copiedVisited[i][j-1] = true;
			isExistInBoard(i, j-1, board, word, copiedVisited, wordIndex+1, isExist);
		}
	}
	
	private boolean[][] copyArray(boolean[][] board){
		boolean[][] copy = new boolean[board.length][board[0].length];
		for(int i = 0; i < copy.length; i++) {
			for(int j = 0; j < copy[i].length; j++) {
				copy[i][j] = board[i][j];
			}
		}
		return copy;
	}
	
	public static void main(String[] args) {
		WordSearchMap s = new WordSearchMap();
		char[][] board = { 	{'A','B','C','E',},
							{'S','F','E','S',},
							{'A','D','E','E',}};
		
//		System.out.println(s.exist(board, "ABCCED"));
//		System.out.println(s.exist(board, "SEE"));
//		System.out.println(s.exist(board, "ABCB"));
		System.out.println(s.exist(board, "ABCESEEEFS"));
	}
}
