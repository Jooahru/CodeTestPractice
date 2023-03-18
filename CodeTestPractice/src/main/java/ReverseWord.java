import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

    public ArrayList<String> Solution(String[] words) {
        ArrayList<String> reverseWords = new ArrayList<String>();
        for (String word : words
        ) {
            String tmp = new StringBuilder(word).reverse().toString();
            reverseWords.add(tmp);
        }
        return reverseWords;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        Scanner kb = new Scanner(System.in);
        System.out.println("입력할 단어갯수를 입력하세요");
        int Number = kb.nextInt();
        String[] str = new String[Number];
        for (int i = 0; i < Number; i++) {
            str[i] = kb.next();
        }
        ArrayList<String> reverseWords = reverseWord.Solution(str);
        for (String x : reverseWords) {
            System.out.println(x);
        }

    }
}
