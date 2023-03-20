import java.util.Scanner;

public class RemoveSameLetter {

    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            if(i==str.indexOf(str.charAt(i))){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
         RemoveSameLetter removeSameLetter = new RemoveSameLetter();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(removeSameLetter.solution(str));
    }

}
