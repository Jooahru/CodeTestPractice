package Array;

import java.util.Scanner;

/*소수 구하기*/
public class Array5 {

	public int solution(int num) {
		int answer = 1;
		for (int i = 3; i <= num; i++) {
			int temp = 0;
			int sqrt = (int) Math.sqrt(i);
			for (int x = 1; x <= sqrt; x++) {
				if (i % x == 0) {
					temp += 2;
				}
				if (temp >= 3) {
					break;
				}
			}
			if (temp == 2) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Array5 array5 = new Array5();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		System.out.print(array5.solution(num));

	}

}
