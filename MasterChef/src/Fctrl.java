import java.io.BufferedReader;
import java.io.InputStreamReader;
/* https://www.codechef.com/problems/FCTRL
 * Practice --> Beginner --> Factorial
 */
public class Fctrl {
	/* Found this solution which is pretty useful
	 * http://www.purplemath.com/modules/factzero.htm
	 * where you keep integer dividing by 5 until you get a result that's < 5 and keep track of the results and sum them all
	 * e.g. 1000 / 5 = 200 / 5 = 40 / 5 = 8 / 5 = 1 < 5 so stop
	 * 200 + 40 + 8 + 1 = 249
	 */
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int T = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < T ; i++) {
			int N = Integer.parseInt(reader.readLine());
			System.out.println(Z(N));
		}
	}
	
	public static int Z(int N) {
		int sum = 0;
		while(N >= 5) {
			N /= 5;
			sum += N;
		}
		return sum;
	}
}
