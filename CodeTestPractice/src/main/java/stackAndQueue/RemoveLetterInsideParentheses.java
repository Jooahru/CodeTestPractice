package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/*
괄호문자제거
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는
프로그램을 작성하세요.
*/
public class RemoveLetterInsideParentheses {

    public String solution(String sentence) {
        String answer = "";
        Stack<Character> stack = new Stack<Character>();
        for (Character x : sentence.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(x);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveLetterInsideParentheses removeLetterInsideParentheses = new RemoveLetterInsideParentheses();
        Scanner kb = new Scanner(System.in);
        String sentence = kb.next();
        System.out.println(removeLetterInsideParentheses.solution(sentence));
    }
}
