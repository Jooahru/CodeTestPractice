package String;

import java.util.Scanner;

public class PrintBigNumber {

	public String solution(String str, int num) {
		String answer = "";
		String[] numbs = str.split(" ");
		for (String x : numbs) {

			System.out.println(x);
		}
		System.out.println(numbs.length);
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				answer += numbs[i];
			} else {
				if (Integer.parseInt(numbs[i]) > Integer.parseInt(numbs[i-1])) {
					answer += numbs[i];
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		PrintBigNumber main = new PrintBigNumber();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		kb.nextLine();
		String str = kb.nextLine();
		System.out.println(main.solution(str, num));

	}

}
