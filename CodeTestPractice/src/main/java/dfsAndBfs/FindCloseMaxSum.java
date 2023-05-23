package dfsAndBfs;

import java.util.Scanner;

public class FindCloseMaxSum {

    static int answer = 0;
    static int number, cutWeight = 0;

    public void DFS(int level, int sum, int[] weights) {
        if(sum>cutWeight){
            return;
        }
        if (level == number) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + weights[level], weights);
            DFS(level + 1, sum, weights);
        }
    }

    public static void main(String[] args) {
        FindCloseMaxSum findCloseMaxSum = new FindCloseMaxSum();
        Scanner kb = new Scanner(System.in);
        cutWeight = kb.nextInt();
        number = kb.nextInt();
        int[] weights = new int[number];
        for (int i = 0; i < number; i++) {
            weights[i] = kb.nextInt();
        }
        findCloseMaxSum.DFS(0, 0, weights);
        System.out.println(answer);

    }

}
