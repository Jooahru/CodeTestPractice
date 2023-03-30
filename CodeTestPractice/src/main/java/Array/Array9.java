package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*격자판 합 구하기*/
public class Array9 {

	public int solution(int num, int[][] numArray) {
		int answer = 0;

		ArrayList<Integer> sumScore = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			int tempTotalScore = 0;
			for (int j = 0; j < num; j++) {
				tempTotalScore += numArray[i][j];
			}
			sumScore.add(tempTotalScore);
		}
		for (int i = 0; i < num; i++) {
			int tempTotalScore = 0;
			for (int j = 0; j < num; j++) {
				tempTotalScore += numArray[j][i];
			}
			sumScore.add(tempTotalScore);
		}
		int tempTotalScore2 = 0;
		for (int i = 0; i < num; i++) {
			tempTotalScore2 += numArray[i][i];
		}
		sumScore.add(tempTotalScore2);
		int tempTotalScore3 = 0;
		for (int i = 0; i < num; i++) {
			tempTotalScore3 += numArray[i][num - 1 - i];
		}
		sumScore.add(tempTotalScore3);
		answer = Collections.max(sumScore);

		return answer;
		
		/*
		 * int answer=-2147000000; int sum1=0, sum2=0; for(int i=0; i<num; i++){
		 * sum1=sum2=0; for(int j=0; j<num; j++){ sum1+=numArray[i][j]; sum2+=numArray[j][i]; }
		 * answer=Math.max(answer, sum1); answer=Math.max(answer, sum2); } sum1=sum2=0;
		 * for(int i=0; i<num; i++){ sum1+=numArray[i][i]; sum2+=numArray[i][n-i-1]; }
		 * answer=Math.max(answer, sum1); answer=Math.max(answer, sum2); return answer;
		 */
	}

	public static void main(String[] args) {
		Array9 array9 = new Array9();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[][] numArray = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				numArray[i][j] = kb.nextInt();
			}
		}
		System.out.print(array9.solution(num, numArray));

	}

}
