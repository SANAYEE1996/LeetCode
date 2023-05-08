package easy;

public class DiagonalSum {
	public int diagonalSum(int[][] mat) {
		int i = 0, j = 0, k = mat[0].length-1;
		int answer = 0;
		while(i < mat.length && j < mat[0].length && k >= 0){
			if(j == k){
				answer += mat[i][j];
			}
			else{
				answer += mat[i][j];
				answer += mat[i][k];
			}
			i++;
			j++;
			k--;
		}
		return answer;
	}
}
