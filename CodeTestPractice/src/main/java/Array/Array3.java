package Array;

import java.util.Scanner;

/*가위바위보 결과 구하기
  가위 : 1 바위 : 2 보 :3
  이기면 A 비기면 D 지면 B*/
public class Array3 {

	public String[] solution(int num, int[] array, int[] array2) {
		String[] answer = new String[num];
		int top = 0;
		for (int i = 0; i < num; i++) {
			if (array[i] == array2[i]) {
				answer[i] = "D";
			} else if (array[i] == 1 && array2[i] == 3)
				answer[i] = "A";
			else if (array[i] == 2 && array2[i] == 1)
				answer[i] = "A";
			else if (array[i] == 3 && array2[i] == 2)
				answer[i] = "A";
			else
				answer[i] = "B";
		}

		return answer;
	}

	public static void main(String[] args) {
		Array3 array2 = new Array3();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] = kb.nextInt();
		}
		int[] numArray2 = new int[num];
		for (int i = 0; i < num; i++) {
			numArray2[i] = kb.nextInt();
		}
		for (String x : array2.solution(num, numArray, numArray2)) {
			System.out.println(x);
		}
	}

}
