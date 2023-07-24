package twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*공통원소 구하기*/
public class FindSameNumber {

    public ArrayList<Integer> solution(int[] numArray1, int[] numArray2, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(numArray1);
        Arrays.sort(numArray2);
        int p1 = 0,p2 = 0;
        while(p1<num1 && p2 < num2){
            if(numArray1[p1]==numArray2[p2]){
                answer.add(numArray1[p1]);
                p1++;
                p2++;
            }else if(numArray1[p1]>numArray2[p2]){
                p2++;
            }else{
                p1++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        FindSameNumber findSameNumber = new FindSameNumber();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] numArray1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArray1[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] numArray2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            numArray2[i] = kb.nextInt();
        }
        for(int x: findSameNumber.solution(numArray1, numArray2, num1 , num2)){
            System.out.print(x+" ");
        }
    }

}
