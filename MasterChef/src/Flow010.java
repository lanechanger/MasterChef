import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW010
 * Practice --> Beginner --> ID & Ship
 */
class Flow010 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		
		while(T-- > 0) {
			switch (inputs.next().toLowerCase().charAt(0)) {
				case 'b':
					System.out.println("BattleShip");
					break;
				case 'c':
					System.out.println("Cruiser");
					break;	
				case 'd':
					System.out.println("Destroyer");
					break;
				case 'f':
					System.out.println("Frigate");
					break;
			}
					
		}
		
		inputs.close();
	} 
}