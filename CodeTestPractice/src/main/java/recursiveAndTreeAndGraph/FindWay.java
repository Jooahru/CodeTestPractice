package recursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class FindWay {

    static int oneWay, wayListSize, answer = 0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> ways;

    public void solution(int startPoint) {
        if (startPoint == oneWay) {
            answer++;
        } else {
            for (int nextPoint : ways.get(startPoint)) {
                if (ch[nextPoint] == 0) {
                    ch[nextPoint] = 1;
                    solution(nextPoint);
                    ch[nextPoint] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindWay findWay = new FindWay();
        Scanner kb = new Scanner(System.in);
        oneWay = kb.nextInt();
        wayListSize = kb.nextInt();
        ways = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= oneWay; i++) {
            ways.add(new ArrayList<Integer>());
        }
        ch = new int[oneWay + 1];
        for (int i = 0; i < wayListSize; i++) {
            int startPoint = kb.nextInt();
            int endPoint = kb.nextInt();
            ways.get(startPoint).add(endPoint);
        }
        ch[1] = 1;
        findWay.solution(1);
        System.out.println(answer);
    }

}
