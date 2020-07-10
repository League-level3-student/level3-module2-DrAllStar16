package _02_More_Algorithms;

import java.util.Comparator;
import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;

			}

		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int p = 0;
		for (int j = 0; j < oysters.size(); j++) {
			if (oysters.get(j) == true) {
				p++;
			}
		}
		return p;
	}

	public static Double findTallest(List<Double> peeps) {
		double t = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > t) {
				t = peeps.get(i);
			}
		}
		return t;

	}

	public static String findLongestWord(List<String> words) {
		String l = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > l.length()) {
				l = words.get(i);
			}
		}
		return l;
	}

	public static Boolean containsSOS(List<String> message1) {
		if (message1.contains(" ... --- ... ")) {
			return true;
		}

		else {
			return false;
		}

	}

	public static List<Double> sortScores(List<Double> results) {
		results.sort(Comparator.naturalOrder());

		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {

		for (int i = 0; i < 5; i++) {
			if (unsortedSequences.get(3).length() > unsortedSequences.get(4).length()) {
				String first = unsortedSequences.get(3);
				String second = unsortedSequences.get(4);
				unsortedSequences.set(3, second);
				unsortedSequences.set(4, first);
			}

			if (unsortedSequences.get(2).length() > unsortedSequences.get(3).length()) {
				String first = unsortedSequences.get(2);
				String second = unsortedSequences.get(3);
				unsortedSequences.set(2, second);
				unsortedSequences.set(3, first);
			}

			if (unsortedSequences.get(1).length() > unsortedSequences.get(2).length()) {
				String first = unsortedSequences.get(1);
				String second = unsortedSequences.get(2);
				unsortedSequences.set(1, second);
				unsortedSequences.set(2, first);
			}

			if (unsortedSequences.get(0).length() > unsortedSequences.get(1).length()) {
				String first = unsortedSequences.get(0);
				String second = unsortedSequences.get(1);
				unsortedSequences.set(0, second);
				unsortedSequences.set(1, first);
			}

		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i > words.size(); i++) {
			if (words.get(i).compareTo(words.get(i + 1)) > 0) {
				String first = words.get(i);
				String second = words.get(i + 1);
				words.set(i, second);
				words.set(i + 1, first);
			}
		}
		return words;
	}
}
