import java.util.Scanner;
import java.lang.Exception;
/* https://www.codechef.com/problems/MUFFINS3
 * Practice --> Beginner --> Packaging Cupcakes
 */
public class Muffins3 {
	public static void main (String[] args) throws Exception
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();
		
		for(int i = 0; i < T ; i++) {
			int N = inputs.nextInt();
			// initially went with a static method that looped & looked for the biggest value A from 1 to N
			// and determined which A had the biggest left over = N % A and returned that A
			// but that was too slow and all the answers turned out to be N/2 + 1 anyways
			System.out.println((N/2)+1);
		}
		
		inputs.close();
	}
}
