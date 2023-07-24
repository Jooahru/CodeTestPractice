package twoPointerAndSlidingWindow;

import java.util.Scanner;

/*두 배열 합치기*/
public class SumTwoArray {

    public int[] solution(int[] numArray1, int[] numArray2, int num) {
        int[] answer = new int[num];
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < numArray1.length && p2 < numArray2.length) {
            if (numArray1[p1] < numArray2[p2]) {
                answer[p3] = (numArray1[p1++]);
                p3++;
            } else {
                answer[p3] = (numArray2[p2++]);
                p3++;
            }
        }
        while (p1 < numArray1.length) {
            answer[p3] = (numArray1[p1++]);
            p3++;
        }
        while (p2 < numArray2.length) {
            answer[p3] = (numArray2[p2++]);
            p3++;
        }

        return answer;

    }

    public static void main(String[] args) {
        SumTwoArray sumTwoArray = new SumTwoArray();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] numArray1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArray1[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] numArray2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            numArray2[i] = kb.nextInt();
        }
        for(int x: sumTwoArray.solution(numArray1, numArray2, num1 + num2)){
            System.out.print(x+" ");
        }
    }

}
