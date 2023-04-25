package SortingAndSearching;

import java.util.Scanner;

public class AscendingOrder {
    public int[] solution(int number, int[] numbers){
        int[] answer = new int[number];

        for(int i = 0 ;i<number-1;i++){
            int idx = i;
            for(int j = i+1;j<number;j++){
                if(numbers[j]<numbers[idx]){
                    idx = j;
                }
            }
            int tmp=numbers[i];
            numbers[i]=numbers[idx];
            numbers[idx]=tmp;

        }
        return answer;
    }

    public static void main(String[] args){
        AscendingOrder ascendingOrder = new AscendingOrder();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numbers = new int[number];
        for(int i =0;i<number;i++){
            numbers[i] = kb.nextInt();
        }
        System.out.println(ascendingOrder.solution(number,numbers));
    }

}
