package hashMapSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/*
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그
기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작
성하세요. 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
*/
public class SelectPresident {

    public char solution(int number, String votes) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char vote : votes.toCharArray()) {
            map.put(vote, map.getOrDefault(vote, 0) + 1);
        }
        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SelectPresident selectPresident = new SelectPresident();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String str = kb.next();
        System.out.println(selectPresident.solution(number,str));
    }
}
