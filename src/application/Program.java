package application;

public class Program {

	public static void main(String[] args) {
		int[] responses = { 1, 2, 5, 3, 2, 1, 1, 1, 5, 4, 3, 3, 3, 2, 2, 1, 5, 4, 4, 14 };
		int[] frequency = new int[6];

		for (int answer = 0; answer < responses.length; answer++) {
			try {
				++frequency[responses[answer]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e.getMessage());
				System.out.println(e);
				System.out.printf("   -- rensposes[%d] = %d%n%n", answer, responses[answer]);
			}
		}

		System.out.printf("%s%10s%n", "Rating", "Frequency");

		for (int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%3d%9d%n", rating, frequency[rating]);
		}
	}

}
