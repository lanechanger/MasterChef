/* https://www.codechef.com/problems/INTEST
 * Practice --> Beginner --> Enormous Input Test
 */
public class Insort {
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String line = reader.readLine();
		int n = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		int k = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		line = null;
		
		int counter = 0;
		int divisible = 0;
		
		while(counter < n) {
			if(Integer.parseInt(reader.readLine()) % k == 0)
				divisible++;
			counter++;
		}
			
		System.out.println(divisible);				
	}
}
