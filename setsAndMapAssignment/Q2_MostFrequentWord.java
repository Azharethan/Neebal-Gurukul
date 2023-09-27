package setsAndMapAssignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q2_MostFrequentWord {
	public static void main(String[] args) {
		String[] banned = { "hit" };
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		System.out.println(mostFrequentWord(paragraph, banned));

	}

	static String mostFrequentWord(String paragraph, String[] banned) {
		Set<String> bannedWord = new HashSet<>(Arrays.asList(banned));
//		System.out.println(bannedWord);
		Map<String, Integer> countWord = new HashMap<>();

		String[] newParagraph = paragraph.toLowerCase().split("[!',?;.\\s]+");
//		System.out.println(Arrays.toString(newParagraph));

		for (String word : newParagraph) {
			if (!bannedWord.contains(word)) {
				countWord.put(word, countWord.getOrDefault(word, 0) + 1);
			}
		}

		String mostFrequentWord = "";
		int maxFrequency = 0;

		for (String word : countWord.keySet()) {
			int count = countWord.get(word);
			if (count > maxFrequency) {
				maxFrequency = count;
				mostFrequentWord = word;
			}
		}
		return mostFrequentWord;

	}
}
