import java.util.Scanner;
/* https://www.codechef.com/problems/CLEANUP
 * Practice --> Easy --> Cleaning Up
 */
class Cleanup {
	public static void main (String[] args)
	{
		Scanner inputs = new Scanner (System.in);

		int cases = inputs.nextInt();

		while(cases --> 0) {
			boolean chef = true;
			// used to alternate between chef and assistant, defaults to T for chef
			boolean[] jobs = new boolean[inputs.nextInt()];
			StringBuilder chefResult = new StringBuilder();
			StringBuilder assResult = new StringBuilder();
			int completed = inputs.nextInt();

			while(completed --> 0) {
				// mark jobs completed as true
				jobs[inputs.nextInt() - 1] = true;
			}

			for(int i = 0; i < jobs.length; i++) {
				// iterate through remaining jobs (false)
				if(!jobs[i]) {
					// alternate between chef and assistant through flag
					if(chef) {
						chefResult.append(i + 1);
						chefResult.append(" ");
						chef = false;
					} else {
						assResult.append(i + 1);
						assResult.append(" ");
						chef = true;				}
				}
			}

			System.out.println(chefResult.toString().trim());
			System.out.println(assResult.toString().trim());
		}

		inputs.close();
	} 
}