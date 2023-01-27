package de.thled.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

	@Test
	void can_play_fizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.play(0);
		assertEquals("0", result);
	}

	@ParameterizedTest()
	@CsvSource({
			"3",
			"6",
			"27",
	})
	void say_fizz_for_multiple_of_3(int multipleOf3) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String result = fizzBuzz.play(multipleOf3);
		assertEquals("Fizz", result);
	}

}
