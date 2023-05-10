package recursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public int solution(int myLocation, int cowLocation) {
        ch = new int[10001];
        ch[myLocation] = 1;
        queue.offer(myLocation);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                for (int j : dis) {
                    int nx = x + j;
                    if (nx == cowLocation) {
                        return L+1;
                    }
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindCow findCow = new FindCow();
        Scanner kb = new Scanner(System.in);
        int myLocation = kb.nextInt();
        int cowLocation = kb.nextInt();
        System.out.println(findCow.solution(myLocation, cowLocation));
    }

}
