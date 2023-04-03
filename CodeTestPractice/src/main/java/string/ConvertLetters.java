package string;

import java.util.*;
public class ConvertLetters {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        ConvertLetters solution = new ConvertLetters();
        System.out.println("solution = " + solution.solution(str));
    }
}

