package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class Factorial {

    public int solution(int number) {
        int answer = 1;
        for (int i = number; i >= 1; i--) {
            answer = answer*i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.print(factorial.solution(number));

    }

}
