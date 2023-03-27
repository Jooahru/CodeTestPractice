import java.util.Scanner;

/*보이는 학생 수 구하기
  N명의 학생의 키가 주어질 때 선생님이 보이는 학생 수 구하기*/
public class Array2 {

	public int solution(int num, int[] array) {
		int answer = 0;
		int top = 0;
		for (int i = 0; i < num; i++) {
			if (array[i] > top) {
				top = array[i];
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Array2 array2 = new Array2();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] = kb.nextInt();
		}
		System.out.println(array2.solution(num, numArray));
	}

}
