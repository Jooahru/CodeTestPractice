package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class FibonacciNumberSum {

    public int solution(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return solution(number - 2) + solution(number - 1);
        }

    }

    public static void main(String[] args) {
        FibonacciNumberSum fibonacciNumberSum = new FibonacciNumberSum();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.println(fibonacciNumberSum.solution(number));
    }

}
