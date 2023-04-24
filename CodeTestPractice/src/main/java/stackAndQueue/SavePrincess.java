package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

    public int solution(int kings, int pickKings) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= kings; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < pickKings; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SavePrincess savePrincess = new SavePrincess();
        Scanner kb = new Scanner(System.in);
        int kings = kb.nextInt();
        int pickKing = kb.nextInt();
        savePrincess.solution(kings, pickKing)


    }

}
