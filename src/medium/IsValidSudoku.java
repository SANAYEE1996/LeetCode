package medium;

import java.util.ArrayList;

public class IsValidSudoku {
	
	int[][] startIndexArray = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};
	
	public boolean isValidSudoku(char[][] board) {
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			list.clear();
			if( !isValidaxis(board, i, list)) {
				return false;
			}
			if(!isValidboxArea(board, startIndexArray[i], list)) {
				return false;
			}
		}
		return true;
    }
	
	boolean isValidaxis(char[][] board, int index, ArrayList<Character> list) {
		for(int i = 0; i < 9; i++) {
			if(board[i][index] != '.' && list.contains(board[i][index])) {
				list.clear();
				return false;
			}
			list.add(board[i][index]);
		}
		list.clear();
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
	
	boolean isValidboxArea(char[][] board, int[] startIndex, ArrayList<Character> list) {
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
		return true;
	}
}

/*
 * [["8","3",".", ".","7",".", ".",".","."],
 *  ["6",".",".", "1","9","5", ".",".","."],
 *  [".","9","8", ".",".",".", ".","6","."],
 *  
 *  ["8",".",".", ".","6",".", ".",".","3"],
 *  ["4",".",".", "8",".","3", ".",".","1"],
 *  ["7",".",".", ".","2",".", ".",".","6"],
 *  
 *  [".","6",".", ".",".",".", "2","8","."],
 *  [".",".",".", "4","1","9", ".",".","5"],
 *  [".",".",".", ".","8",".", ".","7","9"]]
 * */
