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
		while(unsortedSequences.get(0).length() > unsortedSequences.get(3).length()) {
		if (unsortedSequences.get(0).length() > unsortedSequences.get(1).length()) {
			unsortedSequences.set(0, unsortedSequences.get(1));
			unsortedSequences.set(1, unsortedSequences.get(0));
		}
		if (unsortedSequences.get(1).length() > unsortedSequences.get(2).length()) {
			unsortedSequences.set(1, unsortedSequences.get(2));
			unsortedSequences.set(2, unsortedSequences.get(1));
		}
		if (unsortedSequences.get(2).length() > unsortedSequences.get(3).length()) {
			unsortedSequences.set(2, unsortedSequences.get(3));
			unsortedSequences.set(3, unsortedSequences.get(4));
		}
		if (unsortedSequences.get(3).length() > unsortedSequences.get(4).length()) {
			unsortedSequences.set(3, unsortedSequences.get(4));
			unsortedSequences.set(4, unsortedSequences.get(3));
		} 
		}
		return unsortedSequences;
	}
}
