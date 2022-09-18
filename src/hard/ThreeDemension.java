package hard;

import java.util.LinkedList;
import java.util.Queue;

public class ThreeDemension {
	public int solution(String[][] map3d) {
		
		boolean[][][] visited = new boolean[map3d.length][map3d[0].length][map3d[0][0].length()];
		int[] start = new int[3];
		int[] end = new int[3];
		defaultSetting(map3d, start, end, visited);
		
		return gogo(map3d, start, end, visited);
	}
	
	void defaultSetting(String[][] map3d, int[] start, int[] end, boolean[][][] visited) {
		for(int i = 0; i < map3d.length; i++) {
			for(int j = 0; j < map3d[i].length; j++) {
				for(int k = 0; k < map3d[i][j].length(); k++) {
					if(map3d[i][j].charAt(k) == 'S') {
						start[0] = i;
						start[1] = j;
						start[2] = k;
						visited[i][j][k] = true;
					}
					else if(map3d[i][j].charAt(k) == 'E') {
						end[0] = i;
						end[1] = j;
						end[2] = k;
					}
				}
			}
		}
	}
	
	int gogo(String[][] map3d, int[] start, int[] end, boolean[][][] visited) {
		Queue<int[]> que = new LinkedList<>();
		int[] course = {start[0], start[1], start[2], 1};
		que.add(course);
		int xLimit = map3d.length-1;
		int yLimit = map3d[0].length-1;
		int zLimit = map3d[0][0].length()-1;
		int x = 0, y = 0, z = 0, distance = 0;
		int[] addOrMinus = {1,-1};
		
		while(!que.isEmpty()) {
			int[] exam = que.poll();
			x = exam[0];
			y = exam[1];
			z = exam[2];
			distance = exam[3];
			for(int j = 0; j < addOrMinus.length; j++) {
				x = exam[0];
				x += addOrMinus[j];
				if(x < 0 || x > xLimit || visited[x][y][z] || map3d[x][y].charAt(z) == 'X') {
					continue;
				}
				
				if(x == end[0] && y == end[1] && z == end[2]) {
					return distance;
				}
				
				que.add(new int[] {x,y,z,distance+1});
				visited[x][y][z] = true;
			}
			x = exam[0];
			y = exam[1];
			z = exam[2];
			for(int j = 0; j < addOrMinus.length; j++) {
				y = exam[1];
				y += addOrMinus[j];
				if(y < 0 || y > yLimit || visited[x][y][z] || map3d[x][y].charAt(z) == 'X') {
					continue;
				}
				
				if(x == end[0] && y == end[1] && z == end[2]) {
					return distance;
				}
				
				que.add(new int[] {x,y,z,distance+1});
				visited[x][y][z] = true;
			}
			x = exam[0];
			y = exam[1];
			z = exam[2];
			for(int j = 0; j < addOrMinus.length; j++) {
				z = exam[2];
				z += addOrMinus[j];
				if(z < 0 || z > zLimit || visited[x][y][z] || map3d[x][y].charAt(z) == 'X') {
					continue;
				}
				
				if(x == end[0] && y == end[1] && z == end[2]) {
					return distance;
				}
				
				que.add(new int[] {x,y,z,distance+1});
				visited[x][y][z] = true;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		ThreeDemension s = new ThreeDemension();
		String[][] exam1 = {{"XXXXX","00SX0","00X00"},
							{"XE000","0XXX0","0000X"}};
		String[][] exam2 = {{"00000","00000","00E00","00000","00000"},
							{"00000","0XXX0","0XXX0","0XXX0","00000"},
							{"00000","00000","00S00","00000","00000"}};
		String[][] exam3 = {{"S0XX","00XX"},{"XX00","XX0E"}};
		System.out.println("1 : "+s.solution(exam1));
		System.out.println("2 : "+s.solution(exam2));
		System.out.println("3 : "+s.solution(exam3));
	}
}
