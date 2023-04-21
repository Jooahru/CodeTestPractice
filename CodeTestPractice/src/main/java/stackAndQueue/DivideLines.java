package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class DivideLines {
	public int solution(String lines) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();

		for(int i =0;i<lines.length();i++) {
			if(lines.charAt(i)=='(') {
				stack.push('(');
			}else {
				stack.pop();
				if(lines.charAt(i-1)=='(') {
					answer += stack.size();
				}else {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		DivideLines divideLines = new DivideLines();
		Scanner kb = new Scanner(System.in);
		String lines = kb.next();
		System.out.print(divideLines.solution(lines));
	}

}
