package recursiveAndTreeAndGraph;

import java.util.Scanner;

public class FindWay {

    static int oneWay, wayListSize, answer = 0;
    static int[] ch;
    static int ways[][];

    public void solution(int startWay) {
        if (startWay == oneWay) {
            answer++;
        } else {
            for (int i = 1; i <= oneWay; i++) {
                if (ways[startWay][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    solution(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindWay findWay = new FindWay();
        Scanner kb = new Scanner(System.in);
        oneWay = kb.nextInt();
        wayListSize = kb.nextInt();
        ch = new int[oneWay + 1];
        ways = new int[oneWay + 1][oneWay + 1];
        for (int i = 0; i < wayListSize; i++) {
            int startPoint = kb.nextInt();
            int endPoint = kb.nextInt();
            ways[startPoint][endPoint] = 1;
        }
        ch[1] = 1;
        findWay.solution(1);
        System.out.println(answer);
    }

}
