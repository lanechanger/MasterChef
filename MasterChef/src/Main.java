/* https://www.codechef.com/problems/FCTRL2
 * Practice --> Beginner --> Small factorials
 */
public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		byte t = Byte.parseByte(reader.readLine());
		byte counter = (byte) 0;
		byte factory[] = new byte[t];
		
		while(counter < t) {
			factory[counter] = Byte.parseByte(reader.readLine());				
			counter++;
		}
			
		for(int i : factory)
			System.out.println(factorialize(i));
	}
	
	private static java.math.BigInteger factorialize(long n) {
		return bigFactorialize(new java.math.BigInteger(String.valueOf(n)));
	}
	
	private static java.math.BigInteger bigFactorialize(java.math.BigInteger n) {
		if(n.intValue() == 1) {
			return n;
		}
		else {
			return n.multiply(bigFactorialize(new java.math.BigInteger(String.valueOf(n.intValue()-1))));
		}		
	}
}
