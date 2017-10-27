import java.util.Scanner;
/* https://www.codechef.com/problems/MUFFINS3
 * Practice --> Beginner --> Packaging Cupcakes
 */
class Main {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();
		
		for(int i = 0; i < T ; i++) {
			int N = inputs.nextInt();
			System.out.println((N/2)+1);
		}
		
		inputs.close();
	}
}
