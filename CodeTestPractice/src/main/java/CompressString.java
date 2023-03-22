import java.util.Scanner;

public class CompressString {

    public String solution(String str) {
        str=str+" ";
        String answer = "";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += Integer.toString(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        CompressString compressString = new CompressString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(compressString.solution(str));

    }
}
