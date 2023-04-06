package twoPointerAndSlidingWindow;

import java.util.Scanner;
/*
 연속된 자연수의 합
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는
방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.
 */
public class FindNumberSet {

	public int solution(int number) {
		int answer = 0;
		int currentSum = 0;
		int lt = 1;
		for (int i = 1; i < number; i++) {
			currentSum += i;
			if (currentSum == number) {
				answer++;
			}
			while (currentSum >= number) {
				currentSum -= lt;
				lt++;
				if (currentSum == number) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FindNumberSet findNumberSet = new FindNumberSet();
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		System.out.println(findNumberSet.solution(number));

	}

}
