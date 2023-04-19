package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class PickUpDoll {

    public int solution(int num1, int[][] board, int num2, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int pos : moves) {
            for (int i = 0; i < num1; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PickUpDoll pickUpDoll = new PickUpDoll();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[][] board = new int[num1][num1];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int num2 = kb.nextInt();
        int[] moves = new int[num2];
        for (int k = 0; k < num2; k++) {
            moves[k] = kb.nextInt();
        }
        System.out.println(pickUpDoll.solution(num1, board, num2, moves));
    }

}
