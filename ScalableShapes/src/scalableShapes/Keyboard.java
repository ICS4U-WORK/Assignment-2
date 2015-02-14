package scalableShapes;
import java.io.*; //tell the java compiler that we'll be doing 	i/o

/**
 * Keyboard class for general input.
 * @author macdja38
 */
public class Keyboard {
	private static BufferedReader inputStream = new BufferedReader(new 	InputStreamReader(System.in));

	/** Get an integer from the user and return it. 
	 * Insist they give an integer,
	 * don't take no for an answer, keep them their until they
	 * give you an INTEGER, nothing else, no periods, no letters, no compromises
	 * @return int no matter what
	 * @author macdja38 and unknown, mostly macdja38
	 *  */
	public static int getInteger() {
		while(true) {
			try {
				return(Integer.valueOf(inputStream.readLine().trim()).intValue());
			} catch (Exception e) {
				System.out.println("Please input a valid Integer.");
			}
		}
	}
	/**
	 * Get an integer within a given range from the user.
	 * @param low lowest value the user can input
	 * @param heigh heighest value the user can input
	 * @return Integer from user
	 * @author macdja38
	 */
	public static int getInteger(int low, int heigh) {
		int Int = getInteger();
		while(Int>heigh || Int<low) {
			System.out.println("Please input a number between " + low + " and " + heigh + ".");
			Int = getInteger();
		}
		return Int;
	}
	/**
	 * Get an integer within a given range from the user and of a given length.
	 * @param low lowest value the user can input
	 * @param heigh highest value the user can input
	 * @param length length of the string user can input
	 * @return Integer from user
	 * @author macdja38
	 */
	public static int getInteger(int low, int heigh, int length) {
		int Int = getInteger(low, heigh);
		while(String.valueOf(Int).toString().length()!=length) {
			System.out.println("Please enter an Integer " + length + " characters long.");
			Int = getInteger(low, heigh);
		}
		return Int;
	}
	/**
	 * Get an integer of a given length from the user.
	 * @param length
	 * @return Integer from user
	 * @author macdja38
	 */
	public static int getInteger(int length) {
		int Int = getInteger();
		while(String.valueOf(Int).toString().length()!=length) {
			System.out.println("Please enter an Integer " + length + " characters long.");
			Int = getInteger();
		}
		return Int;
	}
	/* Get a double from the user and return it */
	public static double getDouble() {
		try {
			return(Double.valueOf(inputStream.readLine().trim()).doubleValue());
		} catch (Exception e) {
				e.printStackTrace();
				return 0.0;
		}
	}
	
	/* Get a float from the user and return it */
	public static float getFloat() {
		try {
			return(Float.valueOf(inputStream.readLine().trim()).floatValue());
		} catch (Exception e) {
			e.printStackTrace();
			return 0.0f;
		}
	}
	
	/* Get a string of text from the user and return it */
	public static String getString() {
		try {
			return inputStream.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	/* Get a char from the user and return it */
	public static char getCharacter() {
		try {
			String in = inputStream.readLine().trim();
			if (in.length() == 0)
				return (char)0;
			else
				return (in.charAt(0));
		} catch (Exception e) {
			e.printStackTrace();
			return (char)0;
		}
	}
	
	/* Get a boolean from the user and return it */
	public static boolean getBoolean() {
		try {
			return(Boolean.valueOf(inputStream.readLine().trim()).booleanValue());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
