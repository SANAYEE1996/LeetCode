package medium;

import java.util.ArrayList;

public class IsValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			list.clear();
			if(isValidXaxis(board, i, list) && isValidYaxis(board, i, list)) {
				return false;
			}
		}
		
		return false;
    }
	
	boolean isValidXaxis(char[][] board, int index, ArrayList<Character> list) {
		for(int i = 0; i < 9; i++) {
			if(board[index][i] != '.' && list.contains(board[index][i])) {
				list.clear();
				return false;
			}
			list.add(board[index][i]);
		}
		list.clear();
		return true;
	}
	
	boolean isValidYaxis(char[][] board, int index, ArrayList<Character> list) {
		for(int i = 0; i < 9; i++) {
			if(board[i][index] != '.' && list.contains(board[i][index])) {
				list.clear();
				return false;
			}
			list.add(board[i][i]);
		}
		list.clear();
		return true;
	}
	
	boolean isValidboxArea(char[][] board, int[] startIndex, ArrayList<Character> list) {
		list.clear();
		for(int i = startIndex[0]; i < startIndex[0]+3; i++) {
			for(int j = startIndex[1]; j < startIndex[1]+3; j++) {
				if(board[i][j] != '.' && list.contains(board[i][j])) {
					list.clear();
					return false;
				}
				list.add(board[i][j]);
			}
		}
		list.clear();
		return false;
	}
}
