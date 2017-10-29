import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW008
 * Practice --> Beginner --> Servant
 */
class Flow008 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		
		while(T-- > 0) {
			if(inputs.nextInt() < 10)
			{
				System.out.println("What an obedient servant you are!");
			}else {
				System.out.println(-1);
			}
		}
		
		inputs.close();
	} 
}
