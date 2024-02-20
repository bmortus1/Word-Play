package wordPlay;
 
import java.util.HashMap;

public class StringUtils {
	//Returns a hashmap of characters and the count of each character in a string
	public static HashMap<Character, Integer> buildHashMap(String inputString) {
		HashMap<Character, Integer> inputStringHashMap = new HashMap<Character, Integer>();
		for (char c : inputString.toCharArray()) {
			if (!inputStringHashMap.containsKey(c))
				inputStringHashMap.put(c, 1);
			else
				inputStringHashMap.put(c, inputStringHashMap.get(c) + 1);
		}
		return inputStringHashMap;
	}

	//Reverses the order of characters in a string
	public static String reverseString(String inputString) {
		return new StringBuilder(inputString).reverse().toString();
	}

	//Removes non-alphanumeric characters and whitespace and uppercases a string
	public static String normalizeString(String inputString) {
		return inputString.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
	}
}
