package SortingAndSearching;

import java.util.Scanner;

public class BubbleSorting {

	public int[] solution(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int tmp = 0;
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j + 1] < numbers[j]) {
					tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				}
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		BubbleSorting bubbleSorting = new BubbleSorting();
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		int[] numbers = new int[number];
		for (int i = 0; i < number; i++) {
			numbers[i] = kb.nextInt();
		}
		for (int x : bubbleSorting.solution(numbers)) {
			System.out.print(x + " ");
		}

	}

}
