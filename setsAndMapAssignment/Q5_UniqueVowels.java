package setsAndMapAssignment;

import java.util.HashSet;
import java.util.Set;

public class Q5_UniqueVowels {
	public static void main(String[] args) {

		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();

		s1.add("a");
		s1.add("e");
		s1.add("i");
		s1.add("o");
		s1.add("u");

		s2.add("a");
		s2.add("e");
		s2.add("o");
		s2.add("o");

		Set<String> uniqueVowels = findUniqueVowels(s1, s2);
		System.out.println(uniqueVowels);
	}

	static Set<String> findUniqueVowels(Set<String> s1, Set<String> s2) {
		Set<String> uniqueVowels = new HashSet<String>();

		for (String s : s1) {
			if (isVowel(s)) {
				uniqueVowels.add(s);
			}
		}

		for (String s : s2) {
			if (isVowel(s)) {
				uniqueVowels.add(s);
			}
		}

		return uniqueVowels;
	}

	static boolean isVowel(String s) {
		char c = s.toLowerCase().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}
}
