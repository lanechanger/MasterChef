import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/* https://www.codechef.com/problems/FLOW009
 * Practice --> Beginner --> Total Expenses
 */
class Flow009 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		NumberFormat formatter = new DecimalFormat("#0.000000");
		int T = inputs.nextInt();	
		double discount = 0.9;
		
		while(T-- > 0) {
			int quantity = inputs.nextInt();			
			long cost = quantity * inputs.nextLong();
			if(quantity > 1000) {				
				System.out.println(formatter.format(cost * discount));
			}else {
				System.out.println(formatter.format(cost));
			}
		}
		
		inputs.close();
	} 
}