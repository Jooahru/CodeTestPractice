package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int solution(String sentence) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (char x : sentence.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }

        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Postfix postfix = new Postfix();
        Scanner kb = new Scanner(System.in);
        String sentence = kb.next();
        System.out.println(postfix.solution(sentence));

    }

}
