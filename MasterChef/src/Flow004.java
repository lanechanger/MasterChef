import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW004
 * Practice --> Beginner --> First and Last Digit
 */
class Flow004 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();
		
		for(int i = 0; i < T ; i++) {
			String N = inputs.next();
			int first = Integer.parseInt(N.substring(0,1));
			int last = Integer.parseInt(N.substring(N.length()-1));
						
			System.out.println(first + last);
		}
		
		inputs.close();
	}
}
