package de.thled.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void can_play_fizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.play(0);
		assertEquals("0", result);
	}

	@Test
	void say_fizz_for_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String result = fizzBuzz.play(3);
		assertEquals("Fizz", result);
	}

	@Test
	void say_fizz_for_6() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String result = fizzBuzz.play(6);
		assertEquals("Fizz", result);
	}

}
