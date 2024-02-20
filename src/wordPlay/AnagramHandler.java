package wordPlay;

import java.util.HashMap;

public class AnagramHandler {

	public static void checkAnagrams(String[] args) {
		try {
			String inputString1 = args[1];
			String inputString2 = args[2];
			String filePath = args[3];
			Logger.logResultsToFile(filePath, String.format(
					"\"%s\" and \"%s\" are%s anagrams.", 
					inputString1, 
					inputString2, 
					areAnagrams(inputString1, inputString2) ? "" : " not"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean areAnagrams(String string1, String string2) {
		try {
			String cleanString1 = StringUtils.normalizeString(string1);
			String cleanString2 = StringUtils.normalizeString(string2);

			if (cleanString1.length() != cleanString2.length())
				return false;
			else {
				HashMap<Character, Integer> string1HashMap = StringUtils.buildHashMap(cleanString1);
				HashMap<Character, Integer> string2HashMap = StringUtils.buildHashMap(cleanString2);
				return string1HashMap.equals(string2HashMap);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
