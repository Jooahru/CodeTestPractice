package twoPointerAndSlidingWindow;

import java.util.Scanner;

/*
 연속 부분 수열
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.*/
public class FindSumSet {

    public int solution(int length, int targetNumber, int[] numbers) {
        int answer = 0;
        int tempSum = 0;
        int tempNum = 0;
        for (int i = 0; i < length; i++) {
            tempSum += numbers[i];
            if (tempSum == targetNumber) {
                answer++;
            }
            while (tempSum >= targetNumber) {
                tempSum -= numbers[tempNum];
                tempNum++;
                if (tempSum == targetNumber) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindSumSet findSumSet = new FindSumSet();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int targetNumber = kb.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(findSumSet.solution(length, targetNumber, numbers));
    }
}
