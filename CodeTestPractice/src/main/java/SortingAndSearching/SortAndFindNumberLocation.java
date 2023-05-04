package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndFindNumberLocation {

    public int solution(int number, int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int lt =0 ,rt = numbers.length-1;
        while(lt<=rt){
            int mid = (rt+lt)/2;
            if(numbers[mid]==number){
                answer = mid+1;
                break;
            }
            if(numbers[mid]>number){
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SortAndFindNumberLocation sortAndFindNumberLocation = new SortAndFindNumberLocation();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int number = kb.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(sortAndFindNumberLocation.solution(number, numbers));
    }

}
