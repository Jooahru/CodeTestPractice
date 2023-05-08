package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class Factorial {

    public int solution(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * solution(number - 1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.print(factorial.solution(number));

    }

}
