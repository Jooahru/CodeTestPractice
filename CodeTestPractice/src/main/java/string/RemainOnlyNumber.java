package string;

import java.util.Scanner;

/*

*/
public class RemainOnlyNumber {

    public int solution(String str){
       int answer = 0;
       for(char x : str.toCharArray()){
           if(x>=48 && x<=57){
               answer=answer*10+(x-48);
           }
       }
       return answer;
    }

    public static void main(String[] args) {
        RemainOnlyNumber remainOnlyNumber = new RemainOnlyNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(remainOnlyNumber.solution(str));
    }

}
