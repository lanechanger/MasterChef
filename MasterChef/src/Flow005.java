import java.util.Scanner;
/* https://www.codechef.com/problems/FLOW005
 * Practice --> Beginner --> Smallest Numbers of Notes
 */
class Flow005 {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);
		int T = inputs.nextInt();	
		
		while(T-- > 0) {
			System.out.println(countAllNotes(inputs.nextInt()));
		}
		
		inputs.close();
	} 
	
	// create an array as we need to keep track of both the intermediate results and the number of notes deducted so far
	// but we only need to return the latter
	private static int countAllNotes(int N) {
		int[] results = {N,0}; // 0 for the remaining number and 1 for the number of division (result)
		int[] notes = {100,50,10,5,2,1};
		
		for(int note : notes) {			
			countNotes(results, note);
		}
		
		return results[1];
	}
	
	// this will both deduct the max amount of notes from the total and increment the number of notes
	private static void countNotes(int[] results, int note) {
		if(results[0] >= note) {			
			results[1] += results[0] / note;
			results[0] %= note;
		}
	}
}
