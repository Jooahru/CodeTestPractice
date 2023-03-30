package Array;

import java.util.Scanner;

/*격자판 합 구하기*/
public class Array10 {

	int[] dx = { 0, 1, 0, -1 };
	int[] dy = { 1, 0, -1, 0 };

	public int solution(int num, int[][] numArray) {
		int answer = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				boolean isPeak = true;
				for (int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					if (x >= 0 && x < num && y >= 0 && y < num && numArray[i][j] <= numArray[x][y]) {
						isPeak = false;
						break;
					}
				}
				if (isPeak) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Array10 array10 = new Array10();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[][] numArray = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				numArray[i][j] = kb.nextInt();
			}
		}
		System.out.print(array10.solution(num, numArray));

	}

}
