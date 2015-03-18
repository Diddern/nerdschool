public class FizzBuzz {

	public static String fizzBuzzGenerator(int aNumber) {

		StringBuilder sb = new StringBuilder();
		if (Integer.toString(aNumber).contains("3")) {
			sb.append("Fizz");
		}
		if (aNumber % 5 == 0) {
			sb.append("Buzz");
		}
		if (aNumber % 3 == 0 && aNumber % 5 == 0) {
			sb.append("FizzBuzz");
		}
		if (sb.length() == 0) {
			return Integer.toString(aNumber);
		}
		return sb.toString();
	}
}