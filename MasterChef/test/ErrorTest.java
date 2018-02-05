import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ErrorTest {

	@Test
	public void testGood1() {
		// setup
		String s1 = "101";

		// execute
		String rslt = Error.judge(s1);

		// assert
		String expected = "Good";
		assertEquals(rslt, expected);
	}

	@Test
	public void testGood2() {
		// setup
		String s1 = "010";

		// execute
		String rslt = Error.judge(s1);

		// assert
		String expected = "Good";
		assertEquals(rslt,expected);
	}

	@Test
	public void testGood3() {
		// setup
		String s1 = "011";

		// execute
		String rslt = Error.judge(s1);

		// assert
		String expected = "Bad";
		assertEquals(rslt,expected);
	}

}
