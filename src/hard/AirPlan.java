package hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AirPlan {
	
	class Course{
		int target;
		int time;
		int mile;
		boolean[] visited;
		public Course(int target, int time, int mile, boolean[] visited) {
			this.target = target;
			this.time = time;
			this.mile = mile;
			this.visited = visited;
		}
	}
	
	public int[] solution(int n, int k, int[][] paths) {
		int[] answer = new int[2];
		int[][] timeMap = new int[n][n];
		int[][] mileMap = new int[n][n];
		for(int[] i : paths) {
			timeMap[i[0]-1][i[1]-1] = i[2];
			timeMap[i[1]-1][i[0]-1] = i[2];
			mileMap[i[0]-1][i[1]-1] = i[3];
			mileMap[i[1]-1][i[0]-1] = i[3];
		}
		
		gogo(timeMap, mileMap, k);
		
		return answer;
	}
	/*
	 * target, time, mile
	 * */
	void gogo(int[][] timeMap, int[][] mileMap, int k) {
		int minTime = (timeMap[0][k-1] != 0) ? timeMap[0][k-1] : 99999;
		int minMile = (mileMap[0][k-1] != 0) ? mileMap[0][k-1] : 99999;
		Queue<Course> que = new LinkedList<>();
		for(int i = 0; i < timeMap[0].length; i++) {
			if(timeMap[0][i] != 0) {
				boolean[] visited = new boolean[timeMap.length];
				visited[0] = true;
				visited[i] = true;
				que.add(new Course(i,timeMap[0][i],mileMap[0][i], visited));
			}
		}
		System.out.println("일단 ! " +minTime + " " + minMile);
		while(!que.isEmpty()) {
			Course exam = que.poll();
			int target = exam.target;
			int time = exam.time;
			int mile = exam.mile;
			boolean[] visited = exam.visited;
			for(int i = 0; i < timeMap[target].length; i++) {
				if(i == k) {
					System.out.println("어디서 옴 ? ");
					System.out.println("시간 "+time);
					System.out.println("방문한 곳 들 : "+Arrays.toString(visited));
					System.out.println();
					if(time <= minTime) {
						minTime = time;
						minMile = Math.min(mile, minMile);
					}
					break;
				}
				else if(timeMap[target][i] != 0 && !visited[i]) {
					boolean[] visitedGo = visited.clone();
					visitedGo[i] = true;
					que.add(new Course(i, time + timeMap[target][i], mile + mileMap[target][i], visitedGo));
				}
				
			}
		}
		
		System.out.println("최소 시간 : "+minTime);
		System.out.println("최소 마일리지 : "+minMile);
	}
	
	public static void main(String[] args) {
		AirPlan s = new AirPlan();
		int[][] paths = {{1,5,1,1},
						 {1,2,4,3},
						 {1,3,3,2},
						 {2,5,2,1},
						 {2,4,2,3},
						 {3,4,2,2},};
		System.out.println(s.solution(5, 4, paths));
	}
}
