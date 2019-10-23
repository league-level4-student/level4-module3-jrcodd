package _01_introduction;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10000000000000000L;

	public static void terminate() {
		System.exit(0);
	}
}
