import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW002
 * Practice --> Beginner --> Find Remainder
 */
class Flow002 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int N = inputs.nextInt();
		
		for(int i = 0; i < N ; i++) {
			System.out.println(inputs.nextInt() % inputs.nextInt());
		}
		
		inputs.close();
	}
}
