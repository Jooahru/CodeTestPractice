package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj14502 {

	static final int dx[] = { 0, 0, 1, -1 };
	static final int dy[] = { 1, -1, 0, 0 };
	static int row;
	static int column;
	static int[][] map;
	static int[][] cloneMap;
	static int maxSafePoint = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		column = Integer.parseInt(st.nextToken());

		map = new int[row][column];

		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < column; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0);

		System.out.println(maxSafePoint);

	}

	static void dfs(int wallCount) {
		if (wallCount == 3) {
			bfs();
			return;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					dfs(wallCount + 1);
					map[i][j] = 0;
				}
			}
		}
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		cloneMap = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				cloneMap[i][j] = map[i][j];
				if (cloneMap[i][j] == 2) {
					q.add(new int[] { i, j });
				}
			}
		}

		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			int x = tmp[0];
			int y = tmp[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < row && ny >= 0 && ny < column && cloneMap[nx][ny] == 0) {
					cloneMap[nx][ny] = 2;
					q.add(new int[] { nx, ny });
				}
			}
		}
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (cloneMap[i][j] == 0) {
					count++;
				}
			}
		}
		maxSafePoint = Math.max(maxSafePoint, count);
	}

}
