package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class RecursivePrintNumber {

    public void solution(int number) {
        if (number == 0) {
            return;
        } else {
            solution(number - 1);
            System.out.print(number + " ");
        }
    }


    public static void main(String[] args) {
        RecursivePrintNumber recursivePrintNumber = new RecursivePrintNumber();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        recursivePrintNumber.solution(number);
    }
}
