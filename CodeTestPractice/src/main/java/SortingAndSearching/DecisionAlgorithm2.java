package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm2 {

    public boolean distance(int[] houses, int length, int horseNumber) {
        int endPoint = houses[0];
        int pickedHorese = 1;
        for(int i = 0;i<houses.length;i++){
            if(endPoint + length <= houses[i]){
                endPoint = houses[i];
                pickedHorese ++;
            }
        }
        if(pickedHorese >= horseNumber){
            return true;
        }else{
            return false;
        }
    }

    public int solution(int horseNumber, int[] houses) {
        int answer = 0;
        Arrays.sort(houses);
        int lt = 1;
        int rt = Arrays.stream(houses).max().getAsInt()-1;
        while (lt <= rt) {
            int length = (lt + rt) / 2;
            if (distance(houses, length, horseNumber)) {
                answer = length;
                lt = length + 1;
            } else {
                rt = length - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DecisionAlgorithm2 decisionAlgorithm = new DecisionAlgorithm2();
        Scanner kb = new Scanner(System.in);
        int houseNumber = kb.nextInt();
        int horseNumber = kb.nextInt();
        int[] houses = new int[houseNumber];
        for (int i = 0; i < houseNumber; i++) {
            houses[i] = kb.nextInt();
        }
        System.out.println(decisionAlgorithm.solution(horseNumber, houses));
    }

}
