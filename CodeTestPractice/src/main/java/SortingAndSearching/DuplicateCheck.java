package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCheck {

    public String solution(int number, int[] numbers) {
        Arrays.sort(numbers);
        for(int i =0;i<number-1;i++){
            if(numbers[i]==numbers[i+1]){
                return "D";
            }
        }
        return "U";
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
