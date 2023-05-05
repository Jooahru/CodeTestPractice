package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm {

    public int count(int[] songs, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : songs) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int songNumber, int dvdNumber, int[] songs) {
        int answer = 0;
        int lt = Arrays.stream(songs).max().getAsInt();
        int rt = Arrays.stream(songs).sum();
        while (lt <= rt) {
            int capacity = (lt + rt) / 2;
            if (count(songs, capacity) <= dvdNumber) {
                answer = capacity;
                rt = capacity - 1;
            } else {
                lt = capacity + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DecisionAlgorithm decisionAlgorithm = new DecisionAlgorithm();
        Scanner kb = new Scanner(System.in);
        int songNumber = kb.nextInt();
        int dvdNumber = kb.nextInt();
        int[] songs = new int[songNumber];
        for (int i = 0; i < songNumber; i++) {
            songs[i] = kb.nextInt();
        }
        System.out.println(decisionAlgorithm.solution(songNumber, dvdNumber, songs));
    }

}
