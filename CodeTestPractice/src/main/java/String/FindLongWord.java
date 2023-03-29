package String;

import java.util.Scanner;

public class FindLongWord {

    public String Solution(String str) {
        String answer = "";
        String[] s = str.split(" ");
        for (String x : s) {
            if (answer.length() < x.length()) {
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindLongWord findLongWord = new FindLongWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println("answer = " + findLongWord.Solution(str));

    }

}
