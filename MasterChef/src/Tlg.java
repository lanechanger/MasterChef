import java.util.Scanner;
/* https://www.codechef.com/problems/TLG
 * Practice --> Beginner --> The Lead Game
 */
class Tlg {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int N = inputs.nextInt();
		int sumOfSi = 0; // the total score for player 1
		int sumOfTi = 0; // the total score for player 2
		int maxLead = 0; // the biggest lead based on sumOfSi and sumOfTi
		
		for(int i = 0; i < N ; i++) {
			// read in and immediately sum the player's scores as we don't need the individual scores
			sumOfSi += inputs.nextInt();
			sumOfTi += inputs.nextInt();

			// note that the lead will be negative if player 2 is the winner
			// we take advantage of the sign when we determine who the winner is
			int currentLead = sumOfSi - sumOfTi;		
			if(Math.abs(maxLead) < Math.abs(currentLead))
				maxLead = currentLead;
		}
		
		// if maxLead has a negative sign then player 2 is the winner, otherwise player 1 is
		System.out.println(((maxLead < 0) ? "2 " : "1 ") + Math.abs(maxLead));
		inputs.close();
	}
}
