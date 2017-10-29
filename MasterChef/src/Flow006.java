import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW006
 * Practice --> Beginner --> Sum of Digits
 */
class Flow006 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		
		while(T-- > 0) {
			System.out.println(sumDigits(inputs.nextInt()));
		}
		
		inputs.close();
	} 
	
	private static int sumDigits(int N) {
		int sum = 0;
		while(N >= 10) {
			sum += N % 10;
			N /= 10;
		}
		return sum + N;
	}
}
