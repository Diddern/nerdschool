import static org.junit.Assert.*;

import org.junit.*;

public class FizzBuzzTests {

	@Test
	public void CheckThatOneIs1() {
		String expected = "1";
		String actual = FizzBuzz.fizzBuzzGenerator(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testThat3BecomesFizz() {
		String expected = "Fizz";
		String actual = FizzBuzz.fizzBuzzGenerator(3);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatTwoBecomes2() {
		String expected = "2";
		String actual = FizzBuzz.fizzBuzzGenerator(2);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatThirteenBecomesFizz() {
		String expected = "Fizz";
		String actual = FizzBuzz.fizzBuzzGenerator(13);
		assertEquals(expected, actual);
	}

	@Test
	public void testThat5BecomesBuzz() {
		String expected = "Buzz";
		String actual = FizzBuzz.fizzBuzzGenerator(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testThat10BecomesBuzz() {
		String expected = "Buzz";
		String actual = FizzBuzz.fizzBuzzGenerator(10);
		assertEquals(expected, actual);
	}

	@Test
	public void testThat15BecomesFizzBuzz() {
		String expected = "BuzzFizzBuzz";
		String actual = FizzBuzz.fizzBuzzGenerator(15);
		assertEquals(expected, actual);
	}

	@Test
	public void testThat30BecomesFizzBuzzFizzBuzz() {
		String expected = "FizzBuzzFizzBuzz";
		String actual = FizzBuzz.fizzBuzzGenerator(30);
		assertEquals(expected, actual);
	}
}