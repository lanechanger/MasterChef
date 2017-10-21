/* https://www.codechef.com/problems/FCTRL2
 * Practice --> Beginner --> Small factorials
 */
public class Fctrl2 {
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		byte t = Byte.parseByte(reader.readLine());
		byte counter = (byte) 0;
		byte factory[] = new byte[t];
		
		// stores user input in an array
		while(counter < t) {
			factory[counter] = Byte.parseByte(reader.readLine());				
			counter++;
		}
			
		for(int i : factory) {
			System.out.println(factorialize(i));
		}
	}
	
	// normal factorialize function calls recursive factorialize fucntion that deals in big numbers
	private static java.math.BigInteger factorialize(long n) {
		return bigFactorialize(new java.math.BigInteger(String.valueOf(n)));
	}
	
	// standard recursive algorithm to calculate factorials
	private static java.math.BigInteger bigFactorialize(java.math.BigInteger n) {
		if(n.intValue() == 1) {
			return n;
		}
		else {
			return n.multiply(bigFactorialize
					(new java.math.BigInteger(String.valueOf(n.intValue()-1))));
		}		
	}
}
