package SortingAndSearching;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCheck {

    public String solution(int number, int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : numbers) {
            set.add(x);
        }
        if (set.size() == number) {
            return "U";
        }

        return "D";
    }

    public static void main(String[] args) {
        DuplicateCheck duplicatCheck = new DuplicateCheck();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.print(duplicatCheck.solution(number, numbers));
    }
}
