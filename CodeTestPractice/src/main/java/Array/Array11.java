package Array;

import java.util.Scanner;

/*임시반장 구하기*/
public class Array11 {

    public int solution(int num, int[][] numArray) {
        int answer = 0;
        int sameClassNumber = 0;
        int previousSameClassNumber = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < 5; k++) {
                    if (numArray[i][k] == numArray[j][k]) {
                        sameClassNumber++;
                        break;
                    }
                }
            }
            if (sameClassNumber > previousSameClassNumber) {
                previousSameClassNumber = sameClassNumber;
                answer = i + 1;
            }
            sameClassNumber = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Array11 array11 = new Array11();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] numArray = new int[num][5];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                numArray[i][j] = kb.nextInt();
            }
        }
        System.out.print(array11.solution(num, numArray));

    }

}
