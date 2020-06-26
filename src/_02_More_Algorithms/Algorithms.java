package _02_More_Algorithms;

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
			p ++;
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
	
	public static Boolean containsSOS(List<String> message1, List<String> message2) {
		if (message1.contains(" ... --- ... ")) {
			return true;
		}
		
		if (message2.contains(" ... --- ... ")) {
			return true;
		}
		
		else {
			return false;
		}

		
	}
	
}



