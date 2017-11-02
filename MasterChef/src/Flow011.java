import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/* https://www.codechef.com/problems/FLOW011
 * Practice --> Beginner --> Gross Salary
 */
class Flow011 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		NumberFormat formatter = new DecimalFormat("#0.0");
		
		while(T-- > 0) {
			int salary = inputs.nextInt();
			
			if(salary < 1500) {
				System.out.println(2 * salary);
			}else {
				System.out.println(formatter.format((1.98 * salary) + 500));
			}					
		}
		
		inputs.close();
	} 
}