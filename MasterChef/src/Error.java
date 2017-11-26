import java.util.Scanner;

/* https://www.codechef.com/problems/ERROR
 * Practice --> Easy --> Chef and Feedback
 */
class Error {
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		int T = inputs.nextInt();

		while (T-- > 0) {
			String feedback = inputs.next();

			System.out.println(judge(feedback));
		}		

		inputs.close();
	}

	static String judge(String feedback) {
		if (feedback.contains("010") || feedback.contains("101")) {
			return "Good";
		} else {
			return "Bad";
		}
	}
}