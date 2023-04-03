package string;

import java.util.Scanner;

public class DecryptString {

    public String solution(String str, int num) {
        String answer = "";
        String tmp = "";
        for (int i = 0; i < num; i++) {
            tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(tmp, 2);
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        DecryptString main = new DecryptString();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.println(main.solution(str, num));

    }

}
