package hashMapSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class FindAnagrams {

	public int solution(String sentence, String word) {
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < word.length() - 1; i++) {
			map1.put(sentence.charAt(i), map1.getOrDefault(sentence.charAt(i), 0) + 1);
		}
		for (char x : word.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}

		int lt = 0;
		for (int rt = word.length() - 1; rt < sentence.length(); rt++) {
			map1.put(sentence.charAt(rt), map1.getOrDefault(sentence.charAt(rt), 0) + 1);
			if (map1.equals(map2)) {
				answer++;
			}
			map1.put(sentence.charAt(lt), map1.getOrDefault(sentence.charAt(lt), 0) - 1);
			if (map1.get(sentence.charAt(lt)) == 0) {
				map1.remove(sentence.charAt(lt));
			}
			lt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		FindAnagrams findAnagrams = new FindAnagrams();
		Scanner kb = new Scanner(System.in);

		String sentence = kb.next();
		String word = kb.next();
		System.out.print(findAnagrams.solution(sentence, word));

	}

}
