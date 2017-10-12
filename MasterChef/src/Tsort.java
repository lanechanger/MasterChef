/* https://www.codechef.com/problems/TSORT
 * Practice --> Beginner --> Turbo Sort
 */
public class Tsort {	
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int counter = 0;
		int max = Integer.parseInt(reader.readLine());
		int[] sortArray = new int[max];

		while(counter < max) 
			sortArray[counter++] = Integer.parseInt(reader.readLine());
			
		java.util.Arrays.sort(sortArray);
			
		for(int i: sortArray)
			System.out.println(i);					
	}
	
	/** Original solution had more error validation and cleaner coding, trimmed it down to the above for a faster solve time
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String curLine;
		int counter = 0;
		int max = Integer.parseInt(reader.readLine());
		int[] sortArray = new int[max];
		
		if(max > 0) {
			while(counter < max) {
				curLine = reader.readLine();
				if(curLine.matches("[0-9]*")) {
					sortArray[counter] = Integer.parseInt(curLine);
					counter++;
				}				
			}
			
			java.util.Arrays.sort(sortArray);
			
			for(int i: sortArray){
				System.out.println(i);
			}			
		}		
	}
	**/
	
}
