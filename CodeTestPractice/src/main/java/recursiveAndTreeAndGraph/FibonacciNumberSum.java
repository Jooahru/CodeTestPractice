package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class FibonacciNumberSum {

    static int[] fibo;

    public int solution(int number) {
        if (fibo[number] > 0) {
            return fibo[number];
        }
        if (number == 1) {
            return fibo[number] = 1;
        } else if (number == 2) {
            return fibo[number] = 1;
        } else {
            return fibo[number] = solution(number - 2) + solution(number - 1);
        }
    }

    public static void main(String[] args) {
        FibonacciNumberSum fibonacciNumberSum = new FibonacciNumberSum();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        fibo = new int[number + 1];
        fibonacciNumberSum.solution(number);
        for (int i = 1; i <= number; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
