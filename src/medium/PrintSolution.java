package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PrintSolution {
	
	void gogo(int[][] data, int startIndex, ArrayList<Integer> documentList, int endWorkTime, int[] flag) {
		ArrayList<int[]> exam = new ArrayList<>();
		int i = startIndex;
		for(;i < data.length; i++) {
			if(endWorkTime - data[i][1] <= 0) break;
			exam.add(data[i]);
		}
		
		Collections.sort(exam, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				if(a[2] == b[2]) return a[1]-b[1];
				return a[2]-b[2];
			}
		});
		
		
		
		for(int[] a : exam) {
			endWorkTime += a[2];
			documentList.add(a[0]);
		}
		
		flag[0] = i;
		flag[1] = endWorkTime;
		
	}
	
	public int[] print(int[][] data) {
		int endWorkTime = 0;
		ArrayList<Integer> documentList = new ArrayList<>();
		int[] flag = new int[2];
		for(int i = 0; i < data.length; i++) {
			if(endWorkTime - data[i][1] > 0) {
				flag[0] = 0; flag[1] = 0;
				gogo(data, i, documentList, endWorkTime, flag);
				i = flag[0];
				endWorkTime = flag[1];
				continue;
			}
			endWorkTime = data[i][2]+data[i][1];
			documentList.add(data[i][0]);
		}
		System.out.println(documentList);
		
		
		
        int[] answer = new int[data.length];
        return answer;
    }
}
