package SortingAndSearching;

import java.util.Scanner;

public class LRU {

    public int[] solution(int cacheSize, int workSize, int[] works) {
        int[] answer = new int[cacheSize];
        for (int x : works) {
            int pos = -1;
            for (int i = 0; i < cacheSize; i++) {
                System.out.println(answer[i]);
                if (x == answer[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = cacheSize - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }

    public static void main(String[] args) {
        LRU lru = new LRU();
        Scanner kb = new Scanner(System.in);
        int cacheSize = kb.nextInt();
        int workSize = kb.nextInt();
        int[] works = new int[workSize];
        for (int i = 0; i < workSize; i++) {
            works[i] = kb.nextInt();
        }
        for (int x : lru.solution(cacheSize, workSize, works)) {
            System.out.print(x + " ");
        }

    }

}
