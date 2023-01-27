package de.thled.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void can_call_fizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();

		String result = fizzbuzz.play(0);

		assertEquals("0", result);
	}

}
