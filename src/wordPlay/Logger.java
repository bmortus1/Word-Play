package wordPlay;
 
public class Logger {
	public static void logResultsToFile(String filePath, String message) {
		try {
			//This allows for appending to an existing file or creating a new file if it does not exist
			java.io.PrintWriter output = new java.io.PrintWriter(
					new java.io.BufferedWriter(new java.io.FileWriter(filePath,
							true)));
			output.println(message);
			output.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
