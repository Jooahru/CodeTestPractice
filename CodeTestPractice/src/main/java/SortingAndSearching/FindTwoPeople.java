package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTwoPeople {

    public ArrayList<Integer> solution(int number, int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] temp = numbers.clone();
        Arrays.sort(temp);
        for (int i = 0; i < number; i++) {
            if (numbers[i] != temp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindTwoPeople findTwoPeople = new FindTwoPeople();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = kb.nextInt();
        }
        for (int x : findTwoPeople.solution(number, numbers)) {
            System.out.print(x + " ");
        }

    }

}
