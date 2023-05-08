package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class RecursiveConvertNumber {

    public void solution(int number) {
        if (number == 0) {
            return;
        } else {
            solution(number/2);
            System.out.print(number%2);
        }
    }


    public static void main(String[] args) {
        RecursiveConvertNumber recursiveConvertNumber = new RecursiveConvertNumber();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        recursiveConvertNumber.solution(number);
    }
}
