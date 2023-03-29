package Array;

import java.util.Scanner;

/*
 점수계산 연속해서 맞추면 1점 2점 3점 .... 틀리고 다시 맞추면 1점부터 시작*/
public class Array7 {

    public int solution(int num, int[] numArray) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < num; i++) {
            if (numArray[i] == 1) {
                score++;
                answer = answer + score;
            } else {
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array7 array7 = new Array7();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArray = new int[num];
        for (int i = 0; i < num; i++) {
            numArray[i] = kb.nextInt();
        }
        System.out.println(array7.solution(num, numArray));
    }
}
