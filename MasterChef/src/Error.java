import java.util.Scanner;
/* https://www.codechef.com/problems/ERROR
 * Practice --> Easy --> Chef and Feedback
 */
class Error {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();

		while(T --> 0) {
			String feedback = inputs.next();
			
			if(feedback.contains("010") || feedback.contains("101")) {
				System.out.println("Good");
			}else {
				System.out.println("Bad");
			}			
		}

		inputs.close();
	} 
}