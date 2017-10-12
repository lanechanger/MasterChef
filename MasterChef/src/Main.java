/* https://www.codechef.com/problems/TSORT
 * Practice --> Beginner --> Turbo Sort
 */
public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int counter = 0;
		int max = Integer.parseInt(reader.readLine());
		int[] sortArray = new int[max];

		while(counter < max) {
			sortArray[counter++] = Integer.parseInt(reader.readLine());
		}
			
		java.util.Arrays.sort(sortArray);
			
		for(int i: sortArray)
			System.out.println(i);					
	}
}
