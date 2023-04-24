package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeStudyPlan {

    public String solution(String order, String subjects) {
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();
        for (char x : order.toCharArray()) {
            queue.offer(x);
        }
        for (char x : subjects.toCharArray()) {
            if (!queue.isEmpty() && x == queue.peek()) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeStudyPlan makeStudyPlan = new MakeStudyPlan();
        Scanner kb = new Scanner(System.in);
        String order = kb.nextLine();
        String subjects = kb.nextLine();
        System.out.println(makeStudyPlan.solution(order, subjects));
    }

}
