/* https://www.codechef.com/problems/HS08TEST
 * Practice --> Beginner --> ATM
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Hs08test {
	public final static double fee = 0.5; 
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int request = Integer.parseInt(st.nextToken());
		double balance = Double.parseDouble(st.nextToken());	
		NumberFormat formatter = new DecimalFormat("#0.00");   

		if(validTransaction(request,balance)) {
			balance -= request + fee;
		}		

		System.out.println(formatter.format(balance));
	}
	
	private static boolean validTransaction(int request, double balance) {
		return ((request % 5) == 0) && (balance >= (request + fee));
	}
}
