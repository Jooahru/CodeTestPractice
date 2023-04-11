package hashMapSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;
/*
Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아
나그램이라고 합니다.
예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면
A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재
배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세
요. 아나그램 판별시 대소문자가 구분됩니다.
*/
public class Anagram {

    public String solution(String word1, String word2) {
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : word1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : word2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) ==0){
                return "NO";
            }
            map.put(x,map.getOrDefault(x,0)-1);
        }


        return answer;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner kb = new Scanner(System.in);
        String word1 = kb.next();
        String word2 = kb.next();
        System.out.println(anagram.solution(word1, word2));

    }

}
