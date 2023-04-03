package array;

import java.util.Scanner;

/*피보나치 수열 구하기*/
public class Array4 {

	public int[] solution(int num) {
		int[] answer = new int[num];
		answer[0] = 1;
		answer[1] = 1;
		for (int i = 2; i < num; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}

		return answer;
	}

	public static void main(String[] args) {
		Array4 array4 = new Array4();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArray = new int[num];
		for (int x : array4.solution(num)) {
			System.out.print(x + " ");
		}

	}

}
