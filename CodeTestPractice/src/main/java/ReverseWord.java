import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

    public ArrayList<String> Solution(ArrayList<String> words) {
        ArrayList<String> reverseWords = new ArrayList<String>();
        for (String word : words
        ) {
            char[] charWord = word.toCharArray();
            String reverseWord = "";
            for (int i = charWord.length - 1; i >= 0; i--) {
                reverseWord += charWord[i];
            }
            reverseWords.add(reverseWord);
        }
        return reverseWords;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        Scanner kb = new Scanner(System.in);
        System.out.println("입력할 단어갯수를 입력하세요");
        int Number = kb.nextInt();
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < Number; i++) {
            String word = kb.next();
            words.add(word);
        }
        ArrayList<String> reverseWords = new ArrayList<String>();
        reverseWords = reverseWord.Solution(words);
        for (int i =0;i<reverseWords.size();i++) {
            System.out.println(reverseWords.get(i));
        }
    }
}
