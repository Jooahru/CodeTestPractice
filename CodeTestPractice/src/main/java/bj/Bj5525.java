package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5525 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int length = Integer.parseInt(br.readLine());
		String sentence = br.readLine();

		String pN = "I";
		for (int i = 0; i < number; i++) {
			pN = pN + "OI";
		}

		int answer = 0;
		for (int j = 0; j < length - number - (number); j++) {
			System.out.println(sentence.substring(j, j + number + 2 * (number - 1)));
			System.out.println(pN);
			if (pN.equals(sentence.substring(j, j + number + 2 * (number - 1)))) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
