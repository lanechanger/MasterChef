import java.util.Scanner;
/* https://www.codechef.com/problems/CIELAB
 * Practice --> Easy --> Ciel and A-B Problem
 */
class Cielab {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		
		int subtracted = inputs.nextInt() - inputs.nextInt();
		
		// originally had System.out.println((subtracted % 10 == 0) ? (subtracted + 1) : (subtracted - 1));
		// but that was not accepted for some reason, my best guess is on a case like 10-9 it would have 
		// brought it down to a single 0, which it may treat as a "leading zero" despite being the only 0
		System.out.println((subtracted % 10 == 9) ? (subtracted - 1) : (subtracted + 1));
		
		inputs.close();
	} 
}