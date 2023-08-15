package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4948 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int number = Integer.parseInt(br.readLine());
			if (number == 0) {
				break;
			}
			solution(number);
		}

	}

	static void solution(int number) {

		int answer = 0;

		for (int i = number + 1; i <= number * 2; i++) {
			int tempCount = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					tempCount++;
				}

			}
			if (tempCount == 2) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
