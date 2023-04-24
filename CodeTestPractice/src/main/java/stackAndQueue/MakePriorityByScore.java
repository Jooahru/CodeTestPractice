package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakePriorityByScore {

    private class Person {

        int id;
        int score;

        public Person(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }

    public int solution(int people, int pickPerson, int[] scores) {
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < people; i++) {
            queue.offer(new Person(i, scores[i]));
        }
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if (x.score > tmp.score) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == pickPerson) {
                    return answer;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        MakePriorityByScore makePriorityByScore = new MakePriorityByScore();
        Scanner kb = new Scanner(System.in);
        int people = kb.nextInt();
        int pickPerson = kb.nextInt();
        int[] scores = new int[people];
        for (int i = 0; i < people; i++) {
            scores[i] = kb.nextInt();
        }
        System.out.println(makePriorityByScore.solution(people,pickPerson,scores));
    }

}
