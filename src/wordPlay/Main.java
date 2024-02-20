package wordPlay;
 
public class Main {
	public static void main(String[] args) {
		String syntaxDescription = "Wordplay Types:\r\n\r\n"
				+ "\ta = Anagram\r\n"
				+ "\tp = Palindrome\r\n\r\n"
				+ "Syntax:\r\n\r\n"
				+ "\tTo check to see if two words or phrases are anagrams:\r\n"
				+ "\tjava wordPlay.Main a \"Anagram1\" \"Anagram2\" \"Filename to store results\"\r\n\r\n"
				+ "\tTo check to see if a word or phrase is a palindrome:\r\n"
				+ "\tjava wordPlay.Main p \"A word or phrase to check\" \"Filename to store results\"\r\n\r\n"
				+ "Examples:\r\n\r\n"
				+ "\tjava wordPlay.Main a \"Brian Mortus\" \"Brain Tumors\" \"c:\\temp\\results.txt\"\r\n"
				+ "\tjava wordPlay.Main p \"A Man, A Plan, A Canal: Panama\" \"c:\\temp\\results.txt\"";
		// Only run if there are 3 or 4 arguments
		if (args.length == 3 || args.length == 4) {
			String wordPlayType = args[0].trim().toUpperCase();
			if (wordPlayType.equals("A")) {
				// 4 arguments wordPlayType, Anagram1, Anagram2, and a filename to store the results
				if (args.length == 4) {
					AnagramHandler.checkAnagrams(args);
				} else {
					System.out.println("Wrong number of arguments to check anagrams.\r\n\r\n" + syntaxDescription);
					System.exit(-1);
				}
			}
			else if (wordPlayType.equals("P")) {
				// 3 arguments wordPlayType, A word or phrase to check, and a filename to store the results
				if (args.length == 3) {
					PalindromeHandler.checkPalindrome(args);
				} else {
					System.out.println("Wrong number of arguments to check a palindrome.\r\n\r\n" + syntaxDescription);
					System.exit(-1);
				}
			}
		} else {
			System.out.println("Invalid number of arguments.\r\n\r\n"+ syntaxDescription);
			System.exit(-1);
		}
	}
}