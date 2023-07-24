package twoPointerAndSlidingWindow;

import java.util.Scanner;

public class MaxIncome {

	public int solution(int[] dayIncome, int[] days) {
		int answer = 0;
		int tempSum = 0;
		for(int i=0;i<days[1];i++) {
			tempSum  += dayIncome[i];
		}
		answer = tempSum;
		for(int i=days[1];i<days[0];i++) {
			tempSum += dayIncome[i] - dayIncome[i-days[1]];
			answer = Math.max(answer, tempSum);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		MaxIncome maxIncome = new MaxIncome();
		Scanner kb = new Scanner(System.in);
		int[] days = new int[2];
		for (int i = 0; i < 2; i++) {
			days[i] = kb.nextInt();
		}
		int[] dayIncome = new int[days[0]];
		for (int i = 0; i < days[0]; i++) {
			dayIncome[i] = kb.nextInt();
		}
		System.out.print(maxIncome.solution(dayIncome, days)); 

	}

}
