package wordPlay;
 
public class PalindromeHandler {
	public static void checkPalindrome(String[] args) {
		try {
			String inputString = args[1];
			String filePath = args[2];
			Logger.logResultsToFile(filePath, String.format(
					"\"%s\" is%s a palindrome.", 
					inputString,
					isPalindrome(inputString) ? "" : " not"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isPalindrome(String inputString) {
		String forwardString = StringUtils.normalizeString(inputString);
		String backwardString = StringUtils.reverseString(forwardString);
		return (forwardString.equals(backwardString));
	}
}
