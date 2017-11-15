package it.xpug.ocp.fizzbuzz;
import static org.junit.Assert.*;

import org.junit.*;


public class FizzBuzzTest {

	private Game game;

	@Before
	public void setUp() throws Exception {
		game = new GameFactory().create();
	}

	@Test
	public void justSayTheNumber() throws Exception {
		assertEquals("1", game.say(1));
		assertEquals("2", game.say(2));
	}

	@Test
	public void multiplesOfThree() throws Exception {
		assertEquals("Fizz", game.say(3));
		assertEquals("Fizz", game.say(6));
	}

	@Test
	public void multiplesOfFive() throws Exception {
		assertEquals("Buzz", game.say(5));
		assertEquals("Buzz", game.say(10));
	}

	@Test
	public void multiplesOfFiveAndThree() throws Exception {
		assertEquals("FizzBuzz", game.say(15));
		assertEquals("FizzBuzz", game.say(30));
	}

	@Test
	public void multiplesOfSeven() throws Exception {
		assertEquals("Bang", game.say(7));
		assertEquals("Bang", game.say(14));
	}

	@Test
	public void multiplesOfSevenAndThree() throws Exception {
		assertEquals("FizzBang", game.say(7*3));
		assertEquals("FizzBang", game.say(7*3*2));
	}

}
