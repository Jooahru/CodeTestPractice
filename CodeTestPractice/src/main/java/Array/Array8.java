package Array;

import java.util.Scanner;

/*등수 구하기*/
public class Array8 {

	public int[] solution(int num, int[] numArray) {
		int[] answer = new int[num];
		for (int i = 0; i < num; i++) {
			int cnt = 1;
			for (int j = 0; j < num; j++) {
				if (numArray[j] > numArray[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}

		return answer;
	}

	public static void main(String[] args) {
		Array8 array8 = new Array8();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] = kb.nextInt();
		}
		for (int x : array8.solution(num, numArray)) {
			System.out.print(x + " ");
		}

	}

}
