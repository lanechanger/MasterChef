import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW007
 * Practice --> Beginner --> Reverse The Number
 */
class Flow007 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		
		while(T-- > 0) {		
			/* had to add the Integer.parseInt after the initial submission was wrong
			as there was no specification as to whether the output should be a string or an int
			The output requested was "Display the reverse of the given number N." 
			So for numbers like 100, they wanted the result to be 1 rather than 001 which is
			not really the reverse.  */
			System.out.println(Integer.parseInt(new StringBuilder(inputs.next()).reverse().toString()));
		}
		
		inputs.close();
	} 
}
