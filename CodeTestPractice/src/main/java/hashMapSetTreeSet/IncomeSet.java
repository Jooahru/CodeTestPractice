package hashMapSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class IncomeSet {

	public int[] solution(int workDays, int day, int[] incomes) {
		int[] answer = new int[workDays - day + 1];
		for(int i = 0;i<workDays-day+1;i++) {
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int j=0;j<day;j++) {
				map.put(incomes[i+j] , map.getOrDefault(incomes[i+j], 0)+1);
			}
			answer[i] = map.keySet().size();
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
		for(int x : incomeSet.solution(workDays, day, incomes)) {
			System.out.print(x+" ");
		}
	}

}
