package hashMapSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class IncomeSet {

	public int[] solution(int workDays, int day, int[] incomes) {
		int[] answer = new int[workDays - day + 1];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < day-1; i++) {
			map.put(incomes[i], map.getOrDefault(incomes[i], 0) + 1);
		}

		int lt = 0;
		for (int rt = day-1; rt < workDays; rt++) {
			map.put(incomes[rt], map.getOrDefault(incomes[rt], 0)+1);
			answer[lt] = map.size();
			map.put(incomes[lt], map.get(incomes[lt]) - 1);
			if (map.get(incomes[lt]) == 0) {
				map.remove(incomes[lt]);
			}
			lt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		IncomeSet incomeSet = new IncomeSet();
		Scanner kb = new Scanner(System.in);
		int workDays = kb.nextInt();
		int day = kb.nextInt();
		int[] incomes = new int[workDays];
		for (int i = 0; i < workDays; i++) {
			incomes[i] = kb.nextInt();
		}
		for (int x : incomeSet.solution(workDays, day, incomes)) {
			System.out.print(x + " ");
		}
	}

}

