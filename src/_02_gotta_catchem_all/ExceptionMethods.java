package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double num1, double num2) {
		if (num2 == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return num1 / num2;
		}
	}

	public static String ReverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
}
