package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndFindNumberLocation {

    public int solution(int number, int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SortAndFindNumberLocation sortAndFindNumberLocation = new SortAndFindNumberLocation();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int number = kb.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(sortAndFindNumberLocation.solution(number, numbers));
    }

}
