import java.util.Scanner;
import java.lang.Exception;
/* https://www.codechef.com/problems/MUFFINS3
 * Practice --> Beginner --> Packaging Cupcakes
 */
public class Main {
	public static void main (String[] args) throws Exception
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
