package twoPointerAndSlidingWindow;

import java.util.Scanner;

/*
최대 길이 연속부분수열
0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변
경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의
연속부분수열을 찾는 프로그램을 작성하세요.
만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
1 1 0 0 1 1 0 1 1 0 1 1 0 1
여러분이 만들 수 있는 1이 연속된 연속부분수열은 1 1 0 0 1 1 1 1 1 1 1 1 0 1 이며 그
길이는 8입니다.

*/
public class MaxContinueNumber {

    public int solution(int length, int count, int[] numArrays) {
        int answer = 0;
        int lt = 0;
        int convertCount = 0;
        for (int rt = 0; rt < length; rt++) {
            if (numArrays[rt] == 0) {
                convertCount++;
            }
            while (convertCount > count) {
                if (numArrays[lt] == 0) {
                    convertCount--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxContinueNumber maxContinueNumber = new MaxContinueNumber();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int count = kb.nextInt();
        int[] numArrays = new int[length];
        for (int i = 0; i < length; i++) {
            numArrays[i] = kb.nextInt();
        }
        System.out.println(maxContinueNumber.solution(length, count, numArrays));

    }

}
