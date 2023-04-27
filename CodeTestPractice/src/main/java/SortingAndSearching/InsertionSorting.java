package SortingAndSearching;

import java.util.Scanner;

public class InsertionSorting {

    public int[] solution(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (numbers[j] > tmp) {
                    numbers[j + 1] = numbers[j];
                }else{
                    break;
                }

            }
            numbers[j + 1] = tmp;
        }

        return numbers;
    }

    public static void main(String[] args) {
        InsertionSorting insertionSorting = new InsertionSorting();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = kb.nextInt();
        }
        for (int x : insertionSorting.solution(numbers)) {
            System.out.print(x + " ");
        }

    }

}
